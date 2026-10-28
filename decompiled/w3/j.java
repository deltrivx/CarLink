package w3;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f14120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f14121b;

    public j(Resources resources, Resources.Theme theme) {
        this.f14120a = resources;
        this.f14121b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f14120a.equals(jVar.f14120a) && Objects.equals(this.f14121b, jVar.f14121b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14120a, this.f14121b);
    }
}
