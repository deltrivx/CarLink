package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/baidu/carlife/sdk/util/TimerUtils;", "", "<init>", "()V", "Ljava/lang/Runnable;", "task", "", "delay", "period", "Lt8/z;", "schedule", "(Ljava/lang/Runnable;JJ)V", "(Ljava/lang/Runnable;J)V", "stop", "(Ljava/lang/Runnable;)V", "", "Ljava/util/Timer;", "timers", "Ljava/util/Map;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class TimerUtils {
    public static final TimerUtils INSTANCE = new TimerUtils();
    private static final Map<Runnable, Timer> timers = new LinkedHashMap();

    private TimerUtils() {
    }

    public final void schedule(final Runnable task, long delay) {
        l.e(task, "task");
        stop(task);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.baidu.carlife.sdk.util.TimerUtils.schedule.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                task.run();
            }
        }, delay);
        timers.put(task, timer);
    }

    public final void schedule(final Runnable task, long delay, long period) {
        l.e(task, "task");
        stop(task);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.baidu.carlife.sdk.util.TimerUtils.schedule.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                task.run();
            }
        }, delay, period);
        timers.put(task, timer);
    }

    public final void stop(Runnable task) {
        l.e(task, "task");
        Timer timerRemove = timers.remove(task);
        if (timerRemove != null) {
            timerRemove.cancel();
        }
    }
}
