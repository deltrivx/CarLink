package hc;

import android.text.TextUtils;
import l4.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements l4.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6538b;

    public /* synthetic */ s(int i7, String str) {
        this.f6537a = i7;
        this.f6538b = str;
    }

    @Override // l4.o
    public Object O() {
        return this;
    }

    @Override // l4.o
    public boolean R(CharSequence charSequence, int i7, int i10, w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i10), this.f6538b)) {
            return true;
        }
        wVar.f8050c = (wVar.f8050c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f6537a) {
            case 0:
                return a2.f.I(new StringBuilder("<"), this.f6538b, '>');
            case 3:
                return this.f6538b;
            default:
                return super.toString();
        }
    }
}
