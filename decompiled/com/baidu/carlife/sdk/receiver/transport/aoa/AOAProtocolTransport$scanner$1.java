package com.baidu.carlife.sdk.receiver.transport.aoa;

import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import h9.k;
import i9.l;
import i9.n;
import kotlin.Metadata;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "it", "Lt8/z;", "invoke", "(Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class AOAProtocolTransport$scanner$1 extends n implements k {
    final /* synthetic */ AOAProtocolTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOAProtocolTransport$scanner$1(AOAProtocolTransport aOAProtocolTransport) {
        super(1);
        this.this$0 = aOAProtocolTransport;
    }

    @Override // h9.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Communicator) obj);
        return z.f12851a;
    }

    public final void invoke(Communicator communicator) {
        l.e(communicator, "it");
        this.this$0.communicator = communicator;
        this.this$0.onConnectionAttached();
    }
}
