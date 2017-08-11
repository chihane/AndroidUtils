package chihane.rxutils;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;

public class ScheduleCompletable {
    public static CompletableTransformer io2main() {
        return toMain(Schedulers.io());
    }

    public static CompletableTransformer new2main() {
        return toMain(Schedulers.newThread());
    }

    public static CompletableTransformer computation2main() {
        return toMain(Schedulers.computation());
    }

    public static CompletableTransformer single2main() {
        return toMain(Schedulers.single());
    }

    public static CompletableTransformer toMain(final Scheduler scheduler) {
        return new CompletableTransformer() {
            @Override
            public CompletableSource apply(@NonNull Completable completable) {
                return completable.subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
