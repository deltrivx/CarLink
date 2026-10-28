package q7;

import cc.y;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import fc.h0;
import h9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f10965a = i7;
        this.f10967c = hVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f10965a) {
            case 0:
                return new e(this.f10967c, cVar, 0);
            default:
                return new e(this.f10967c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f10965a) {
            case 0:
                ((e) create(yVar, cVar)).invokeSuspend(z.f12851a);
                break;
            default:
                ((e) create(yVar, cVar)).invokeSuspend(z.f12851a);
                break;
        }
        return z8.a.f15774a;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10965a) {
            case 0:
                int i7 = this.f10966b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                h0 h0Var = i.f10982g;
                d dVar = new d(this.f10967c, 0);
                this.f10966b = 1;
                h0Var.l(dVar, this);
                break;
            default:
                int i10 = this.f10966b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                h0 h0Var2 = MainActivity.f2913z;
                d dVar2 = new d(this.f10967c, 1);
                this.f10966b = 1;
                h0Var2.l(dVar2, this);
                break;
        }
        return z8.a.f15774a;
    }
}
