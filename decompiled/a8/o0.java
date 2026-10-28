package a8;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(f1.b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f186a = i7;
        this.f187b = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f186a) {
            case 0:
                return new o0(this.f187b, cVar, 0);
            case 1:
                return new o0(this.f187b, cVar, 1);
            default:
                return new o0(this.f187b, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f186a) {
            case 0:
                o0 o0Var = (o0) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                o0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                o0 o0Var2 = (o0) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                o0Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                o0 o0Var3 = (o0) create(yVar, cVar);
                t8.z zVar3 = t8.z.f12851a;
                o0Var3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f186a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f187b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    MediaPlayer mediaPlayer = d8.p.f3826a;
                    if (mediaPlayer != null) {
                        try {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                            }
                            mediaPlayer.reset();
                            mediaPlayer.release();
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    d8.p.f3826a = null;
                }
                break;
            case 1:
                t8.a.e(obj);
                f8.i iVar = f8.i.f5499a;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    f8.i.f5500b.l();
                } else {
                    f8.i.f5500b.k();
                }
                break;
            default:
                t8.a.e(obj);
                o7.g gVar = o7.g.f9489a;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    o7.g.f9490b.l();
                } else {
                    o7.g.f9490b.k();
                }
                break;
        }
        return zVar;
    }
}
