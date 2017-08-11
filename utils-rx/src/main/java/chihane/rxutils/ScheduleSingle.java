package chihane.rxutils;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;

public class ScheduleSingle {
    public static <T> SingleTransformer<T, T> io2main() {
        return toMain(Schedulers.io());
    }

    public static <T> SingleTransformer<T, T> new2main() {
        return toMain(Schedulers.newThread());
    }

    public static <T> SingleTransformer<T, T> computation2main() {
        return toMain(Schedulers.computation());
    }

    public static <T> SingleTransformer<T, T> single2main() {
        return toMain(Schedulers.single());
    }

    public static <T> SingleTransformer<T, T> toMain(final Scheduler scheduler) {
        return new SingleTransformer<T, T>() {
            @Override
            public SingleSource<T> apply(@NonNull Single<T> single) {
                return single.subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
