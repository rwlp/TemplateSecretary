package rwlp.templatescretary.di;

import dagger.Module;
import dagger.Provides;
import rwlp.templatescretary.repositories.Repository;

@Module
public class RepositoryModule {
    @Provides
    public Repository provideRepository() {
        return new Repository();
    }
}