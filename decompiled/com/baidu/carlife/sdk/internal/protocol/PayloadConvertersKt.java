package com.baidu.carlife.sdk.internal.protocol;

import com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto;
import com.baidu.carlife.protobuf.CarlifeFeatureConfigProto;
import com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto;
import com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoProto;
import com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto;
import com.baidu.carlife.protobuf.CarlifeVehicleInfoProto;
import com.google.protobuf.j0;
import i9.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002\u001a\u0010\u0010\u0004\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002\u001a\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, d2 = {"builder", "Lcom/baidu/carlife/protobuf/CarlifeFeatureConfigListProto$CarlifeFeatureConfigList$Builder;", "", "Lcom/baidu/carlife/protobuf/CarlifeFeatureConfigProto$CarlifeFeatureConfig;", "proto", "Lcom/baidu/carlife/protobuf/CarlifeFeatureConfigListProto$CarlifeFeatureConfigList;", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoListProto$CarlifeSubscribeMobileCarLifeInfoList;", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoProto$CarlifeSubscribeMobileCarLifeInfo;", "Lcom/baidu/carlife/protobuf/CarlifeVehicleInfoListProto$CarlifeVehicleInfoList;", "Lcom/baidu/carlife/protobuf/CarlifeVehicleInfoProto$CarlifeVehicleInfo;", "toMap", "", "", "", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class PayloadConvertersKt {
    public static final CarlifeFeatureConfigListProto.CarlifeFeatureConfigList.Builder builder(List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> list) {
        l.e(list, "<this>");
        CarlifeFeatureConfigListProto.CarlifeFeatureConfigList.Builder builderNewBuilder = CarlifeFeatureConfigListProto.CarlifeFeatureConfigList.newBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addFeatureConfig((CarlifeFeatureConfigProto.CarlifeFeatureConfig) it.next());
        }
        builderNewBuilder.setCnt(builderNewBuilder.getFeatureConfigCount());
        return builderNewBuilder;
    }

    public static final CarlifeFeatureConfigListProto.CarlifeFeatureConfigList proto(List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> list) {
        l.e(list, "<this>");
        CarlifeFeatureConfigListProto.CarlifeFeatureConfigList.Builder builderNewBuilder = CarlifeFeatureConfigListProto.CarlifeFeatureConfigList.newBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addFeatureConfig((CarlifeFeatureConfigProto.CarlifeFeatureConfig) it.next());
        }
        builderNewBuilder.setCnt(builderNewBuilder.getFeatureConfigCount());
        j0 j0VarM16build = builderNewBuilder.m16build();
        l.d(j0VarM16build, "builder.build()");
        return (CarlifeFeatureConfigListProto.CarlifeFeatureConfigList) j0VarM16build;
    }

    /* JADX INFO: renamed from: proto, reason: collision with other method in class */
    public static final CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList m3proto(List<CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> list) {
        l.e(list, "<this>");
        CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.Builder builderNewBuilder = CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.newBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addSubscribemobileCarLifeInfo((CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo) it.next());
        }
        builderNewBuilder.setCnt(builderNewBuilder.getSubscribemobileCarLifeInfoCount());
        j0 j0VarM16build = builderNewBuilder.m16build();
        l.d(j0VarM16build, "builder.build()");
        return (CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList) j0VarM16build;
    }

    /* JADX INFO: renamed from: proto, reason: collision with other method in class */
    public static final CarlifeVehicleInfoListProto.CarlifeVehicleInfoList m4proto(List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> list) {
        l.e(list, "<this>");
        CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.Builder builderNewBuilder = CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.newBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addVehicleInfo((CarlifeVehicleInfoProto.CarlifeVehicleInfo) it.next());
        }
        builderNewBuilder.setCnt(builderNewBuilder.getVehicleInfoCount());
        j0 j0VarM16build = builderNewBuilder.m16build();
        l.d(j0VarM16build, "builder.build()");
        return (CarlifeVehicleInfoListProto.CarlifeVehicleInfoList) j0VarM16build;
    }

    public static final Map<String, Integer> toMap(List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> list) {
        l.e(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig : list) {
            String key = carlifeFeatureConfig.getKey();
            l.d(key, "it.key");
            linkedHashMap.put(key, Integer.valueOf(carlifeFeatureConfig.getValue()));
        }
        return linkedHashMap;
    }
}
