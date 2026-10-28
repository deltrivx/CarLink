package s6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Fragment implements q6.a {
    @Override // q6.a
    public final void e() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        f().c(i7);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f().d();
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        f().e(i7);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        f().f();
    }
}
