package rwlp.templatescretary.di;

import dagger.Component;
import rwlp.templatescretary.views.MainActivity;

@Component(modules = {RepositoryModule.class})
public interface AppComponent {
    //Injection methods
    void inject(MainActivity mainActivity);

    // Additional methods to expose dependencies if needed
}