package org.uengine.cloud.app;

import java.util.Map;

/**
 * Created by uengine on 2018. 1. 23..
 */
public class AppStage {
    private String deployment;
    private String external;
    private String internal;
    private String marathonAppId;
    private int servicePort;
    private Map deployJson;
    private Map mesos;
    private boolean configChanged;
    private boolean sticky;
    private int weight;

    public String getDeployment() {
        return deployment;
    }

    public void setDeployment(String deployment) {
        this.deployment = deployment;
    }

    public String getExternal() {
        return external;
    }

    public void setExternal(String external) {
        this.external = external;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getMarathonAppId() {
        return marathonAppId;
    }

    public void setMarathonAppId(String marathonAppId) {
        this.marathonAppId = marathonAppId;
    }

    public int getServicePort() {
        return servicePort;
    }

    public void setServicePort(int servicePort) {
        this.servicePort = servicePort;
    }

    public Map getDeployJson() {
        return deployJson;
    }

    public void setDeployJson(Map deployJson) {
        this.deployJson = deployJson;
    }

    public boolean getConfigChanged() {
        return configChanged;
    }

    public void setConfigChanged(boolean configChanged) {
        this.configChanged = configChanged;
    }

    public boolean getSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Map getMesos() {
        return mesos;
    }

    public void setMesos(Map mesos) {
        this.mesos = mesos;
    }
}
