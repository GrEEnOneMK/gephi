/*
Copyright 2008-2011 Gephi
Authors : Antonio Patriarca <antoniopatriarca@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.gephi.visualization.rendering.command;

import org.gephi.visualization.api.view.ui.UIShape;
import org.gephi.visualization.data.graph.VizEdge3D;
import org.gephi.visualization.data.graph.VizNode3D;

/**
 *
 * @author Antonio Patriarca <antoniopatriarca@gmail.com>
 */
public final class CommandListBuilders3D {
    
    public final CommandListBuilder<VizNode3D> nodeBuilder;
    public final CommandListBuilder<VizEdge3D> edgeBuilder;
    // TODO: add labels and group command lists builders..
    public final CommandListBuilder<UIShape> uiShapeBuilder;

    public CommandListBuilders3D(CommandListBuilder<VizNode3D> nodeBuilder, 
            CommandListBuilder<VizEdge3D> edgeBuilder, 
            CommandListBuilder<UIShape> uiShapeBuilder) {
        this.nodeBuilder = nodeBuilder;
        this.edgeBuilder = edgeBuilder;
        this.uiShapeBuilder = uiShapeBuilder;
    }
    
}
