package chihane.rxutils;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;

import static io.reactivex.schedulers.Schedulers.single;

public class ScheduleFlowable {
    public static <T> FlowableTransformer<T, T> io2main() {
        return toMain(Schedulers.io());
    }

    public static <T> FlowableTransformer<T, T> new2main() {
        return toMain(Schedulers.newThread());
    }

    public static <T> FlowableTransformer<T, T> computation2main() {
        return toMain(Schedulers.computation());
    }

    public static <T> FlowableTransformer<T, T> single2main() {
        return toMain(single());
    }

    public static <T> FlowableTransformer<T, T> toMain(final Scheduler scheduler) {
        return new FlowableTransformer<T, T>() {
            @Override
            public Publisher<T> apply(@NonNull Flowable<T> flowable) {
                return flowable.subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
