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

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class AndroidManifest {
    //TODO add the required parameters
    //should this be in the constructor?
    public static void createManifest(){
        Manifest manifest = new Manifest();
        
        try {
                //TODO change location to fit the root directory
		File file = new File("D:\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Manifest.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(manifest, file);
		jaxbMarshaller.marshal(manifest, System.out);
 
	      } catch (JAXBException e) {
	      }
    }
}
