package jhaman.das.playgroundapp

import android.app.Application
import android.content.Context
import jhaman.das.playgroundapp.di.initKoin
import org.koin.dsl.module


class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(additionalModules = listOf(module {
            single<Context> { this@AppApplication }
        }
        ))
    }
}