/**
 * Copyright 2016 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.storm.mysql.schema;

/**
 * Complete column schema/information of a mysql table.
 */
public class ColumnInfo {

    private final String            name;
    private final int               position;
    private final ColumnDataType    columnDataType;

    /**
     * Column Info creation.
     *
     * @param name Name of the column.
     * @param position Position of the column.
     * @param mysqlType Type of the column.
     */
    public ColumnInfo(String name, int position, String mysqlType) {
        this.name = name;
        this.position = position;
        this.columnDataType = ColumnDataType.valueOf(mysqlType.toUpperCase()).initialize();
    }

    /**
     * Get the name of the column.
     * @return
     */
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public ColumnDataType getColumnDataType() {
        return columnDataType;
    }

    @Override
    public String toString() {
        return "ColumnInfo{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", columnDataType=" + columnDataType +
                '}';
    }
}
