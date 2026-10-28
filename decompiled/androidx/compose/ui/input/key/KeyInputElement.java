package androidx.compose.ui.input.key;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import i2.e;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lq2/z0;", "Li2/e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class KeyInputElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f950b;

    public KeyInputElement(k kVar, k kVar2) {
        this.f949a = kVar;
        this.f950b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f949a == keyInputElement.f949a && this.f950b == keyInputElement.f950b;
    }

    public final int hashCode() {
        k kVar = this.f949a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.f950b;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Override // q2.z0
    public final o i() {
        e eVar = new e();
        eVar.f6610o = this.f949a;
        eVar.f6611p = this.f950b;
        return eVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        e eVar = (e) oVar;
        eVar.f6610o = this.f949a;
        eVar.f6611p = this.f950b;
    }
}
