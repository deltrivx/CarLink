package w3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f14117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f14118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14119c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f14117a = colorStateList;
        this.f14118b = configuration;
        this.f14119c = theme == null ? 0 : theme.hashCode();
    }
}
