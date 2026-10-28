package com.baidu.carlife.sdk.internal.transport;

import android.os.Handler;
import i9.l;
import i9.n;
import kotlin.Metadata;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt8/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class MessageDispatcher$sendTimeoutMonitor$1 extends n implements h9.a {
    final /* synthetic */ MessageDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDispatcher$sendTimeoutMonitor$1(MessageDispatcher messageDispatcher) {
        super(0);
        this.this$0 = messageDispatcher;
    }

    @Override // h9.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m5invoke();
        return z.f12851a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m5invoke() {
        if (this.this$0.context.getConnectionType() == 2) {
            Handler handler = this.this$0.sendHandler;
            if (handler == null) {
                l.j("sendHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            this.this$0.context.onConnectionAttached();
        }
    }
}
