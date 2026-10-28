package t6;

import android.content.Intent;
import android.util.Log;
import p4.a0;
import p4.i;
import p4.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends i implements q6.a {
    @Override // q6.a
    public final void e() {
        u uVar = this.f10192r;
        if (uVar == null) {
            return;
        }
        p4.a aVar = new p4.a(uVar);
        u uVar2 = this.f10192r;
        if (uVar2 == null || uVar2 == aVar.f10140p) {
            aVar.a(new a0(3, this));
            aVar.c();
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // p4.i
    public final void o(int i7, int i10, Intent intent) {
        if (u.D(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i10 + " data: " + intent);
        }
        f().c(i7);
    }
}
