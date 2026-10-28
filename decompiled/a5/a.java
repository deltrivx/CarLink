package a5;

import android.os.Bundle;
import android.support.v4.media.session.r;
import j.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40b;

    public a(r rVar) {
        this.f39a = 0;
        this.f40b = new LinkedHashSet();
        rVar.H("androidx.savedstate.Restarter", this);
    }

    public a(j jVar) {
        this.f39a = 1;
        this.f40b = jVar;
    }

    @Override // a5.d
    public final Bundle a() {
        switch (this.f39a) {
            case 0:
                Bundle bundleJ = k9.a.j((t8.j[]) Arrays.copyOf(new t8.j[0], 0));
                List listJ0 = p.J0((LinkedHashSet) this.f40b);
                bundleJ.putStringArrayList("classes_to_restore", listJ0 instanceof ArrayList ? (ArrayList) listJ0 : new ArrayList<>(listJ0));
                return bundleJ;
            default:
                Bundle bundle = new Bundle();
                ((j) this.f40b).l().getClass();
                return bundle;
        }
    }
}
