package l8;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f8197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f8199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9.a f8200e;

    public j0(String str, n0 n0Var, String str2, Drawable drawable, h9.a aVar, int i7) {
        str2 = (i7 & 4) != 0 ? "" : str2;
        drawable = (i7 & 8) != 0 ? new ColorDrawable(0) : drawable;
        aVar = (i7 & 16) != 0 ? new b3.i0(19) : aVar;
        i9.l.e(str, "label");
        i9.l.e(str2, "default");
        i9.l.e(drawable, "icon");
        i9.l.e(aVar, "canSelect");
        this.f8196a = str;
        this.f8197b = n0Var;
        this.f8198c = str2;
        this.f8199d = drawable;
        this.f8200e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return i9.l.a(this.f8196a, j0Var.f8196a) && i9.l.a(this.f8197b, j0Var.f8197b) && i9.l.a(this.f8198c, j0Var.f8198c) && i9.l.a(this.f8199d, j0Var.f8199d) && i9.l.a(this.f8200e, j0Var.f8200e);
    }

    public final int hashCode() {
        return this.f8200e.hashCode() + ((this.f8199d.hashCode() + ob.a.l(this.f8198c, (this.f8197b.hashCode() + (this.f8196a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DropdownOption(label=" + this.f8196a + ", value=" + this.f8197b + ", default=" + this.f8198c + ", icon=" + this.f8199d + ", canSelect=" + this.f8200e + ")";
    }
}
