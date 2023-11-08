package jhaman.das.playgroundapp.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import jhaman.das.playgroundapp.BuildConfig
import kotlinx.serialization.json.Json
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import jhaman.das.playgroundapp.data.api.UserApi
import jhaman.das.playgroundapp.data.repo.UserRepository
import jhaman.das.playgroundapp.domain.GetUsersListUseCase
import jhaman.das.playgroundapp.ui.main.MainViewModel

fun initKoin(additionalModules: List<Module>): KoinApplication {
    return startKoin {
        modules(additionalModules + coreModule + apiModule)
    }
}

private val coreModule = module {
    single {
        HttpClient(engine = get()) {
            expectSuccess = true
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    explicitNulls = false
                })
            }
            defaultRequest {
                url(BuildConfig.API_BASE_URL)
            }

        }
    }
}

private val apiModule = module {
    single {
        OkHttp.create()
    }
    singleOf(::MainViewModel)
    singleOf(::UserApi)
    singleOf(::GetUsersListUseCase)
    singleOf(::UserRepository)

    }

