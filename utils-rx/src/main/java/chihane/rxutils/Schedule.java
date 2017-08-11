package chihane.rxutils;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;

public class Schedule {
    public static <T> ObservableTransformer<T, T> io2main() {
        return schedule2main(Schedulers.io());
    }

    public static <T> ObservableTransformer<T, T> new2main() {
        return schedule2main(Schedulers.newThread());
    }

    public static <T> ObservableTransformer<T, T> computation2main() {
        return schedule2main(Schedulers.computation());
    }

    public static <T> ObservableTransformer<T, T> single2main() {
        return schedule2main(Schedulers.single());
    }

    public static <T> ObservableTransformer<T, T> schedule2main(final Scheduler scheduler) {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(@NonNull Observable<T> upstream) {
                return upstream.subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
