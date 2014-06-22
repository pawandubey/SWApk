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
@XmlRootElement(name="manifest")
public class Manifest {
    
    private static final String SCHEMA = "http://schemas.android.com/apk/res/android";
    private final String xmlnsAndroid = SCHEMA;
    private String pack = "com.pawandubey";
    private String sharedUserId = "App";
    private String sharedUserLabel = "App"; 
    private Integer versionCode = 100;
    private String versionName = "Alpha";
    private String installLocation = "auto";
    private Application application = new Application();
    
    
    @XmlElement(name = "application")
    public Application getApplication(){
        return application;
    }
    public void setApplication(Application application){
        this.application=application;
    }
    
    
    @XmlAttribute(name="xmlns:android")
    public String getXmlnsAndroid(){
        return xmlnsAndroid;
    }
    
    @XmlAttribute(name="package")
    public String getPack(){
        return pack;
    }
    
    public void setPack(String pack){
        this.pack = pack;
    }
    
    @XmlAttribute(name="android:sharedUserId")
    public String getSharedUserId(){
        return sharedUserId;
    }
    
    public void setSharedUserId(String sharedUserId){
        this.sharedUserId = sharedUserId;
    }

    @XmlAttribute(name="android:sharedUserLabel")
    public String getSharedUserLabel() {
        return sharedUserLabel;
    }

    public void setSharedUserLabel(String sharedUserLabel) {
        this.sharedUserLabel = sharedUserLabel;
    }
    @XmlAttribute(name="android:versionCode")
    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }
    
    @XmlAttribute(name="android:versionName")
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @XmlAttribute(name="android:installLocation")    
    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }
}
