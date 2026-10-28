package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends s implements na.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f3859a;

    public c0(TypeVariable typeVariable) {
        i9.l.e(typeVariable, "typeVariable");
        this.f3859a = typeVariable;
    }

    @Override // na.b
    public final e a(wa.c cVar) {
        Annotation[] declaredAnnotations;
        i9.l.e(cVar, "fqName");
        TypeVariable typeVariable = this.f3859a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i2.c.x(declaredAnnotations, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return i9.l.a(this.f3859a, ((c0) obj).f3859a);
        }
        return false;
    }

    @Override // na.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f3859a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? u8.w.f13122a : i2.c.z(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f3859a.hashCode();
    }

    public final String toString() {
        return c0.class.getName() + ": " + this.f3859a;
    }
}
