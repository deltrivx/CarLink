package jb;

import aa.f0;
import java.util.List;
import p.i3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f7043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.f f7044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.k f7045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f7046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta.g f7047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ta.a f7048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb.j f7049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f7050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f7051i;

    public k(i iVar, ta.f fVar, x9.k kVar, f0 f0Var, ta.g gVar, ta.a aVar, lb.j jVar, i3 i3Var, List list) {
        String strE;
        i9.l.e(iVar, "components");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(gVar, "versionRequirementTable");
        i9.l.e(aVar, "metadataVersion");
        i9.l.e(list, "typeParameters");
        this.f7043a = iVar;
        this.f7044b = fVar;
        this.f7045c = kVar;
        this.f7046d = f0Var;
        this.f7047e = gVar;
        this.f7048f = aVar;
        this.f7049g = jVar;
        this.f7050h = new i3(this, i3Var, list, "Deserializer for \"" + kVar.getName() + '\"', (jVar == null || (strE = jVar.E()) == null) ? "[container not found]" : strE);
        this.f7051i = new t(this);
    }

    public final k a(x9.k kVar, List list, ta.f fVar, f0 f0Var, ta.g gVar, ta.a aVar) {
        i9.l.e(list, "typeParameterProtos");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(gVar, "versionRequirementTable");
        i9.l.e(aVar, "metadataVersion");
        int i7 = aVar.f12855b;
        if ((i7 != 1 || aVar.f12856c < 4) && i7 <= 1) {
            gVar = this.f7047e;
        }
        return new k(this.f7043a, fVar, kVar, f0Var, gVar, aVar, this.f7049g, this.f7050h, list);
    }
}
