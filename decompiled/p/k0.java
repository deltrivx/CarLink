package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements q0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j.h f9820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f9821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f9822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f9823d;

    public k0(r0 r0Var) {
        this.f9823d = r0Var;
    }

    @Override // p.q0
    public final boolean a() {
        j.h hVar = this.f9820a;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    @Override // p.q0
    public final int b() {
        return 0;
    }

    @Override // p.q0
    public final void c(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.q0
    public final void dismiss() {
        j.h hVar = this.f9820a;
        if (hVar != null) {
            hVar.dismiss();
            this.f9820a = null;
        }
    }

    @Override // p.q0
    public final CharSequence e() {
        return this.f9822c;
    }

    @Override // p.q0
    public final Drawable g() {
        return null;
    }

    @Override // p.q0
    public final void i(CharSequence charSequence) {
        this.f9822c = charSequence;
    }

    @Override // p.q0
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.q0
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.q0
    public final void l(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.q0
    public final void m(int i7, int i10) {
        if (this.f9821b == null) {
            return;
        }
        r0 r0Var = this.f9823d;
        j.g gVar = new j.g(r0Var.getPopupContext());
        j.d dVar = (j.d) gVar.f6795c;
        CharSequence charSequence = this.f9822c;
        if (charSequence != null) {
            dVar.f6752d = charSequence;
        }
        l0 l0Var = this.f9821b;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        dVar.f6755g = l0Var;
        dVar.f6756h = this;
        dVar.f6758j = selectedItemPosition;
        dVar.f6757i = true;
        j.h hVarD = gVar.d();
        this.f9820a = hVarD;
        AlertController$RecycleListView alertController$RecycleListView = hVarD.f6799f.f6775e;
        alertController$RecycleListView.setTextDirection(i7);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f9820a.show();
    }

    @Override // p.q0
    public final int n() {
        return 0;
    }

    @Override // p.q0
    public final void o(ListAdapter listAdapter) {
        this.f9821b = (l0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        r0 r0Var = this.f9823d;
        r0Var.setSelection(i7);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i7, this.f9821b.getItemId(i7));
        }
        dismiss();
    }
}
