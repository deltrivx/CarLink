package q3;

import cc.y;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, i iVar, long j5, y8.c cVar) {
        super(2, cVar);
        this.f10887b = z10;
        this.f10888c = iVar;
        this.f10889d = j5;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new f(this.f10887b, this.f10888c, this.f10889d, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((y) obj, (y8.c) obj2)).invokeSuspend(z.f12851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // a9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f10886a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            t8.a.e(r11)
            goto L4c
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            t8.a.e(r11)
            r9 = r10
            goto L36
        L1b:
            t8.a.e(r11)
            boolean r11 = r10.f10887b
            q3.i r0 = r10.f10888c
            z8.a r3 = z8.a.f15774a
            if (r11 != 0) goto L3c
            j2.d r4 = r0.f10896a
            r10.f10886a = r2
            r5 = 0
            long r7 = r10.f10889d
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L36
            goto L4b
        L36:
            n3.t r11 = (n3.t) r11
            r11.getClass()
            goto L51
        L3c:
            r9 = r10
            j2.d r4 = r0.f10896a
            r9.f10886a = r1
            long r5 = r9.f10889d
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L4c
        L4b:
            return r3
        L4c:
            n3.t r11 = (n3.t) r11
            r11.getClass()
        L51:
            t8.z r11 = t8.z.f12851a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
