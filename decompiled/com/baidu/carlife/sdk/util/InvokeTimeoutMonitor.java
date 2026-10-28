package com.baidu.carlife.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/baidu/carlife/sdk/util/InvokeTimeoutMonitor;", "", "Landroid/os/Looper;", "looper", "", "timeout", "Lkotlin/Function0;", "Lt8/z;", "onTimeout", "<init>", "(Landroid/os/Looper;JLh9/a;)V", "tick", "()V", "enter", "exit", "Ljava/lang/Runnable;", "runnable", "monitor", "(Ljava/lang/Runnable;)V", "release", "Lh9/a;", "threshold", "J", "", "isReleased", "Z", "monitoring", "Ljava/util/concurrent/atomic/AtomicLong;", "count", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class InvokeTimeoutMonitor {
    public static final long TICK_INTERVAL = 100;
    private AtomicLong count;
    private final Handler handler;
    private boolean isReleased;
    private volatile boolean monitoring;
    private final h9.a onTimeout;
    private final long threshold;

    public InvokeTimeoutMonitor(Looper looper, long j5, h9.a aVar) {
        l.e(looper, "looper");
        l.e(aVar, "onTimeout");
        this.onTimeout = aVar;
        this.threshold = j5 / 100;
        this.count = new AtomicLong(0L);
        this.handler = new Handler(looper, new a(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handler$lambda$0(InvokeTimeoutMonitor invokeTimeoutMonitor, Message message) {
        l.e(message, "it");
        if (invokeTimeoutMonitor.isReleased) {
            return true;
        }
        if (invokeTimeoutMonitor.monitoring && invokeTimeoutMonitor.count.incrementAndGet() >= invokeTimeoutMonitor.threshold) {
            invokeTimeoutMonitor.exit();
            invokeTimeoutMonitor.onTimeout.invoke();
        }
        invokeTimeoutMonitor.tick();
        return true;
    }

    public final void enter() {
        this.count.set(0L);
        this.monitoring = true;
    }

    public final void exit() {
        this.monitoring = false;
        this.count.set(0L);
    }

    public final void monitor(Runnable runnable) {
        l.e(runnable, "runnable");
        enter();
        runnable.run();
        exit();
    }

    public final void release() {
        this.isReleased = true;
        this.handler.removeMessages(0);
    }

    public final void tick() {
        this.handler.sendEmptyMessageDelayed(0, 100L);
    }
}
