package u1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import i9.t;
import k2.f;
import l0.o0;
import q2.c2;
import q2.z0;
import r1.o;
import s.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnDragListener, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f13038c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        d dVar = new d();
        dVar.f13042q = 0L;
        this.f13036a = dVar;
        this.f13037b = new g(0);
        this.f13038c = new z0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f924a.f13036a.hashCode();
            }

            @Override // q2.z0
            public final o i() {
                return this.f924a.f13036a;
            }

            @Override // q2.z0
            public final /* bridge */ /* synthetic */ void j(o oVar) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        o0 o0Var = new o0(22, dragEvent);
        int action = dragEvent.getAction();
        c2 c2Var = c2.f10601a;
        g gVar = this.f13037b;
        d dVar = this.f13036a;
        switch (action) {
            case 1:
                t tVar = new t();
                f fVar = new f(o0Var, dVar, tVar);
                if (fVar.invoke(dVar) == c2Var) {
                    q2.f.A(dVar, fVar);
                }
                boolean z10 = tVar.f6684a;
                gVar.getClass();
                s.b bVar = new s.b(gVar);
                while (bVar.hasNext()) {
                    ((d) bVar.next()).E0(o0Var);
                }
                return z10;
            case 2:
                dVar.D0(o0Var);
                return false;
            case 3:
                return dVar.A0(o0Var);
            case 4:
                b2.a aVar = new b2.a(18, o0Var);
                if (aVar.invoke(dVar) == c2Var) {
                    q2.f.A(dVar, aVar);
                }
                gVar.clear();
                return false;
            case 5:
                dVar.B0(o0Var);
                return false;
            case 6:
                dVar.C0(o0Var);
                return false;
            default:
                return false;
        }
    }
}
