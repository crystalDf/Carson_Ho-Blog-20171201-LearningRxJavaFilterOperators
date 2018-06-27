package com.star.learningrxjavafilteroperators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RxJava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//                    emitter.onNext(2);
//                    emitter.onNext(3);
//                    emitter.onNext(4);
//                    emitter.onNext(5);
//                })
//                .filter(integer -> integer > 3)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .just(1, "star", 3, "crystal", 5)
//                .ofType(Integer.class)
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .skip(1)
//                .skipLast(2)
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .intervalRange(0, 5, 0, 1, TimeUnit.SECONDS)
//                .skip(1, TimeUnit.SECONDS)
//                .skipLast(1, TimeUnit.SECONDS)
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 1, 2)
//                .distinct()
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 1, 2, 3, 3, 4, 4)
//                .distinctUntilChanged()
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//                    emitter.onNext(2);
//                    emitter.onNext(3);
//                    emitter.onNext(4);
//                    emitter.onNext(5);
//                })
//                .take(2)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//                    emitter.onNext(2);
//                    emitter.onNext(3);
//                    emitter.onNext(4);
//                    emitter.onNext(5);
//                })
//                .takeLast(3)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//
//                    Thread.sleep(500);
//                    emitter.onNext(2);
//
//                    Thread.sleep(400);
//                    emitter.onNext(3);
//
//                    Thread.sleep(300);
//                    emitter.onNext(4);
//
//                    Thread.sleep(300);
//                    emitter.onNext(5);
//
//                    Thread.sleep(300);
//                    emitter.onNext(6);
//
//                    Thread.sleep(400);
//                    emitter.onNext(7);
//
//                    Thread.sleep(300);
//                    emitter.onNext(8);
//
//                    Thread.sleep(300);
//                    emitter.onNext(9);
//
//                    Thread.sleep(300);
//                    emitter.onComplete();
//                })
//                .throttleFirst(1, TimeUnit.SECONDS)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//
//                    Thread.sleep(500);
//                    emitter.onNext(2);
//
//                    Thread.sleep(400);
//                    emitter.onNext(3);
//
//                    Thread.sleep(300);
//                    emitter.onNext(4);
//
//                    Thread.sleep(300);
//                    emitter.onNext(5);
//
//                    Thread.sleep(300);
//                    emitter.onNext(6);
//
//                    Thread.sleep(400);
//                    emitter.onNext(7);
//
//                    Thread.sleep(300);
//                    emitter.onNext(8);
//
//                    Thread.sleep(300);
//                    emitter.onNext(9);
//
//                    Thread.sleep(300);
//                    emitter.onComplete();
//                })
//                .throttleLast(1, TimeUnit.SECONDS)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//
//                    Thread.sleep(500);
//                    emitter.onNext(2);
//
//                    Thread.sleep(400);
//                    emitter.onNext(3);
//
//                    Thread.sleep(300);
//                    emitter.onNext(4);
//
//                    Thread.sleep(300);
//                    emitter.onNext(5);
//
//                    Thread.sleep(300);
//                    emitter.onNext(6);
//
//                    Thread.sleep(400);
//                    emitter.onNext(7);
//
//                    Thread.sleep(300);
//                    emitter.onNext(8);
//
//                    Thread.sleep(300);
//                    emitter.onNext(9);
//
//                    Thread.sleep(300);
//                    emitter.onComplete();
//                })
//                .sample(1, TimeUnit.SECONDS)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//                    Thread.sleep(500);
//
//                    emitter.onNext(2);
//                    Thread.sleep(1500);
//
//                    emitter.onNext(3);
//                    Thread.sleep(1500);
//
//                    emitter.onNext(4);
//                    Thread.sleep(500);
//
//                    emitter.onNext(5);
//                    Thread.sleep(500);
//
//                    emitter.onNext(6);
//                    Thread.sleep(1500);
//
//                    emitter.onComplete();
//                })
//                .throttleWithTimeout(1, TimeUnit.SECONDS)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .create((ObservableOnSubscribe<Integer>) emitter -> {
//
//                    emitter.onNext(1);
//                    Thread.sleep(500);
//
//                    emitter.onNext(2);
//                    Thread.sleep(1500);
//
//                    emitter.onNext(3);
//                    Thread.sleep(1500);
//
//                    emitter.onNext(4);
//                    Thread.sleep(500);
//
//                    emitter.onNext(5);
//                    Thread.sleep(500);
//
//                    emitter.onNext(6);
//                    Thread.sleep(1500);
//
//                    emitter.onComplete();
//                })
//                .debounce(1, TimeUnit.SECONDS)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .firstElement()
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .lastElement()
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .elementAt(2)
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .elementAt(6, 10)
//                .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));
//

            Observable
                    .just(1, 2, 3, 4, 5)
                    .elementAtOrError(6)
                    .subscribe(integer -> Log.d(TAG, "获取到的整型事件元素是: " + integer));

    }
}
