package d8;

import b8.c2;
import b8.m2;
import b8.n2;
import cc.b0;
import com.baidu.carlife.sdk.util.Logger;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i9.v f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f3834c;

    public r(i9.v vVar, List list, n2 n2Var) {
        this.f3832a = vVar;
        this.f3833b = list;
        this.f3834c = n2Var;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        c2 c2Var = (c2) obj;
        i9.v vVar = this.f3832a;
        int i7 = vVar.f6686a;
        List list = this.f3833b;
        int size = list.size();
        n2 n2Var = this.f3834c;
        if (i7 >= size || !i9.l.a(c2Var, ((m2) list.get(vVar.f6686a)).f1617d)) {
            m2 m2Var = (m2) u8.p.m0(list);
            boolean zA = i9.l.a(c2Var, m2Var != null ? m2Var.f1617d : null);
            vVar.f6686a = zA ? 1 : 0;
            if (zA) {
                Logger.INSTANCE.d("CarLife_Vehicle", a2.f.G("【任务重置并触发】", n2Var.f1624b, " 重新开始"));
            }
        } else {
            int i10 = vVar.f6686a + 1;
            vVar.f6686a = i10;
            Logger.INSTANCE.d("CarLife_Vehicle", "【任务触发】" + n2Var.f1624b + " 第" + i10 + "/" + list.size() + "步 " + ((m2) list.get(vVar.f6686a - 1)).f1616c);
            if (vVar.f6686a == list.size()) {
                b0.s(v.f3842a, null, new q(n2Var, null), 3);
                vVar.f6686a = 0;
            }
        }
        return z.f12851a;
    }
}
