package rwlp.templatescretary;

import android.app.Application;

import rwlp.templatescretary.di.AppComponent;
import rwlp.templatescretary.di.DaggerAppComponent;
import rwlp.templatescretary.di.RepositoryModule;
import rwlp.templatescretary.di.AppComponent;

public class TemplateSecretaryApplication extends Application {

    private AppComponent appComponent;

    // Reference to the application graph that is used across the whole app
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .repositoryModule(new RepositoryModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
