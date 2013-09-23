/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
*/

package org.pentaho.ui.xul.containers;

import org.pentaho.ui.xul.XulContainer;

public interface XulTreeChildren extends XulContainer {
  
  public void setAlternatingbackground(boolean alt);
  public boolean isAlternatingbackground();
  
  public void addItem(XulTreeItem item);
  public void removeItem(XulTreeItem item);
  
  public XulTreeRow addNewRow();
  
  public void removeAll();
  public XulTreeItem getItem(int rowIndex);
  public void removeItem(int rowIndex);
  public int getItemCount();

  public boolean isHierarchical();
  public XulTree getTree();


}
