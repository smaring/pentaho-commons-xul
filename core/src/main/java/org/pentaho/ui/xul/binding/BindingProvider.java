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
 * Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
 */

package org.pentaho.ui.xul.binding;

import org.pentaho.ui.xul.XulEventSource;

/**
 * User: nbaker Date: Jun 28, 2010 Time: 8:47:29 AM
 * 
 * Registering a BindingProvider with a XulComponent allows bindings created by that component to be customized.
 */
public interface BindingProvider {
  Binding getBinding( XulEventSource source, String prop1, XulEventSource target, String prop2 );

  Binding getBinding( XulEventSource source, String prop1, XulEventSource target, String prop2,
      BindingConvertor<?, ?> defaultConvertor );
}
