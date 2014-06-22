/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pawandubey.swapk.api;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
@XmlRootElement(name="application")
public class Application {
    
    private Boolean allowTaskReparenting;
    private Boolean allowBackup;
    private String backupAgent;
    private Boolean debuggable;
    private String description;
    private Boolean enabled;
    private Boolean hascode;
    private Boolean hardwareAccelerated;
    private Boolean killAfterRestore;
    private Boolean largeHeap;
    private String manageSpaceActivity;
    private String name;
    private String permission;
    private Boolean persistent;
    private String process;
    private Boolean restoreAnyVersion;
    private String requiredAccountType;
    private String restrictedAccountType;
    private Boolean supportsRtl;
    private String taskAffinity;
    private Boolean testOnly;
    private String uiOptions;
    private Boolean vmSafeMode;

    @XmlAttribute(name="android:allowTastReparenting")
    public Boolean getAllowTaskReparenting() {
        return allowTaskReparenting;
    }

    public void setAllowTaskReparenting(Boolean allowTaskReparenting) {
        this.allowTaskReparenting = allowTaskReparenting;
    }

    @XmlAttribute(name="android:allowBackup")
    public Boolean getAllowBackup() {
        return allowBackup;
    }

    public void setAllowBackup(Boolean allowBackup) {
        this.allowBackup = allowBackup;
    }

    @XmlAttribute(name="android:backupAgent")
    public String getBackupAgent() {
        return backupAgent;
    }

    public void setBackupAgent(String backupAgent) {
        this.backupAgent = backupAgent;
    }

    @XmlAttribute(name="android:debuggable")
    public Boolean getDebuggable() {
        return debuggable;
    }

    public void setDebuggable(Boolean debuggable) {
        this.debuggable = debuggable;
    }

    @XmlAttribute(name="android:description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlAttribute(name="android:enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @XmlAttribute(name="android:hasCode")
    public Boolean getHascode() {
        return hascode;
    }

    public void setHascode(Boolean hascode) {
        this.hascode = hascode;
    }

    @XmlAttribute(name="android:hardwareAccelerated")
    public Boolean getHardwareAccelerated() {
        return hardwareAccelerated;
    }

    public void setHardwareAccelerated(Boolean hardwareAccelerated) {
        this.hardwareAccelerated = hardwareAccelerated;
    }

    @XmlAttribute(name="android:killAfterRestore")
    public Boolean getKillAfterRestore() {
        return killAfterRestore;
    }

    public void setKillAfterRestore(Boolean killAfterRestore) {
        this.killAfterRestore = killAfterRestore;
    }

    @XmlAttribute(name="android:largeHeap")
    public Boolean getLargeHeap() {
        return largeHeap;
    }

    public void setLargeHeap(Boolean largeHeap) {
        this.largeHeap = largeHeap;
    }

    @XmlAttribute(name="android:manageSpaceActivity")
    public String getManageSpaceActivity() {
        return manageSpaceActivity;
    }

    public void setManageSpaceActivity(String manageSpaceActivity) {
        this.manageSpaceActivity = manageSpaceActivity;
    }

    @XmlAttribute(name="android:name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name="android:permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @XmlAttribute(name="android:persistent")
    public Boolean getPersistent() {
        return persistent;
    }

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    @XmlAttribute(name="android:process")
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @XmlAttribute(name="android:restoreAnyVersion")
    public Boolean getRestoreAnyVersion() {
        return restoreAnyVersion;
    }

    public void setRestoreAnyVersion(Boolean restoreAnyVersion) {
        this.restoreAnyVersion = restoreAnyVersion;
    }

    @XmlAttribute(name="android:requiredAccountType")
    public String getRequiredAccountType() {
        return requiredAccountType;
    }

    public void setRequiredAccountType(String requiredAccountType) {
        this.requiredAccountType = requiredAccountType;
    }

    @XmlAttribute(name="android:restrictedAccountType")
    public String getRestrictedAccountType() {
        return restrictedAccountType;
    }

    public void setRestrictedAccountType(String restrictedAccountType) {
        this.restrictedAccountType = restrictedAccountType;
    }

    @XmlAttribute(name="android:supportsRtl")
    public Boolean getSupportsRtl() {
        return supportsRtl;
    }

    public void setSupportsRtl(Boolean supportsRtl) {
        this.supportsRtl = supportsRtl;
    }

    @XmlAttribute(name="android:taskAffinity")
    public String getTaskAffinity() {
        return taskAffinity;
    }

    public void setTaskAffinity(String taskAffinity) {
        this.taskAffinity = taskAffinity;
    }

    @XmlAttribute(name="android:testOnly")
    public Boolean getTestOnly() {
        return testOnly;
    }

    public void setTestOnly(Boolean testOnly) {
        this.testOnly = testOnly;
    }

    @XmlAttribute(name="android:uiOptions")
    public String getUiOptions() {
        return uiOptions;
    }

    public void setUiOptions(String uiOptions) {
        this.uiOptions = uiOptions;
    }

    @XmlAttribute(name="android:vmSafeMode")
    public Boolean getVmSafeMode() {
        return vmSafeMode;
    }

    public void setVmSafeMode(Boolean vmSafeMode) {
        this.vmSafeMode = vmSafeMode;
    }
    
    
}
