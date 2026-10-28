package androidx.compose.ui.input.pointer;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import k2.m0;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lq2/z0;", "Lk2/m0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class SuspendPointerInputElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f955c;

    public SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i7) {
        obj2 = (i7 & 2) != 0 ? null : obj2;
        this.f953a = obj;
        this.f954b = obj2;
        this.f955c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return l.a(this.f953a, suspendPointerInputElement.f953a) && l.a(this.f954b, suspendPointerInputElement.f954b) && this.f955c == suspendPointerInputElement.f955c;
    }

    public final int hashCode() {
        Object obj = this.f953a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f954b;
        return this.f955c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // q2.z0
    public final o i() {
        return new m0(this.f953a, this.f954b, this.f955c);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        m0 m0Var = (m0) oVar;
        Object obj = m0Var.f7254o;
        Object obj2 = this.f953a;
        boolean z10 = !l.a(obj, obj2);
        m0Var.f7254o = obj2;
        Object obj3 = m0Var.f7255p;
        Object obj4 = this.f954b;
        if (!l.a(obj3, obj4)) {
            z10 = true;
        }
        m0Var.f7255p = obj4;
        Class<?> cls = m0Var.f7256q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f955c;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            m0Var.C0();
        }
        m0Var.f7256q = pointerInputEventHandler;
    }
}
