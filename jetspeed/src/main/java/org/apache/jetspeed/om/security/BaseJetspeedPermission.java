/*
 * Copyright 2000-2001,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jetspeed.om.security;

/**
 * A Jetspeed basic Group.
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: BaseJetspeedPermission.java,v 1.3 2004/02/23 03:14:12 jford Exp $
 */
public class BaseJetspeedPermission implements Permission
{
    protected String name;
    protected String id = null;
    protected boolean isNew = true;

    public BaseJetspeedPermission(String id)
    {
        this.id = id;
        isNew = true;
    }

    public BaseJetspeedPermission()
    {
        isNew = true;
    }

    /**
     * Get the name of the Permission
     *
     * @return the name of the permission.
     */
    public String getName()
    {
        return name;
    }
 
    /**
     * Set the name of the Permission
     *
     * @param permissionName the name of the Permission.
     */
    public void setName(String permissionName)
    {
        name = permissionName;
    }

    /**
     * Get the id of the Permission
     *
     * @return the id of the permission.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Set the id of the Permission
     *
     * @param id the new id for the permission
     */
    public void setId(String id)
    {      
        if (this.id == null)
        {
            this.id = id;
        }
    }

    public boolean isNew()
    {
        return isNew;
    }

    void setNew(boolean isNew)
    {
        this.isNew = isNew;
    }

}




