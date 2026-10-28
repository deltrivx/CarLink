package r6;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v4.media.session.r;
import e6.f;
import java.util.List;
import p4.l;
import p4.u;
import s6.b;
import s6.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11639c;

    public a(Activity activity, Object obj, int i7) {
        this.f11639c = i7;
        this.f4439a = activity;
        this.f4440b = obj;
    }

    @Override // e6.f
    public final void d(List list, int i7, r rVar) {
        switch (this.f11639c) {
            case 0:
                s6.a bVar = i7 == 1 ? new b() : new c();
                bVar.setArguments(f.g(u6.c.a(65535), list));
                bVar.setRetainInstance(true);
                bVar.f().f10292b = true;
                bVar.f().f10296f = rVar;
                FragmentManager fragmentManager = (FragmentManager) this.f4440b;
                if (fragmentManager != null) {
                    fragmentManager.beginTransaction().add(bVar, bVar.toString()).commitAllowingStateLoss();
                    break;
                }
                break;
            default:
                t6.a bVar2 = i7 == 1 ? new t6.b() : new t6.c();
                int i10 = 65535;
                if (i7 == 1) {
                    try {
                        ((l) ((Activity) this.f4439a)).getClass();
                        break;
                    } catch (IllegalArgumentException unused) {
                        i10 = 255;
                    } catch (Exception unused2) {
                    }
                }
                bVar2.setArguments(f.g(u6.c.a(i10), list));
                bVar2.setRetainInstance(true);
                bVar2.f().f10292b = true;
                bVar2.f().f10296f = rVar;
                u uVar = (u) this.f4440b;
                if (uVar != null) {
                    p4.a aVar = new p4.a(uVar);
                    aVar.d(0, bVar2, bVar2.toString());
                    aVar.c();
                    break;
                }
                break;
        }
    }
}
