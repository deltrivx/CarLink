package a4;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f37a;

    public i(Object obj) {
        this.f37a = h.f(obj);
    }

    @Override // a4.g
    public final String a() {
        return this.f37a.toLanguageTags();
    }

    @Override // a4.g
    public final Object b() {
        return this.f37a;
    }

    public final boolean equals(Object obj) {
        return this.f37a.equals(((g) obj).b());
    }

    @Override // a4.g
    public final Locale get(int i7) {
        return this.f37a.get(i7);
    }

    public final int hashCode() {
        return this.f37a.hashCode();
    }

    @Override // a4.g
    public final boolean isEmpty() {
        return this.f37a.isEmpty();
    }

    @Override // a4.g
    public final int size() {
        return this.f37a.size();
    }

    public final String toString() {
        return this.f37a.toString();
    }
}
