/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.examples.client;

import org.apache.accumulo.core.client.AccumuloClient;
import org.apache.accumulo.examples.cli.ClientOnRequiredTable;

/**
 * Simple example for using tableOperations() (like create, delete, flush, etc).
 */
public class Flush {

  public static void main(String[] args) {
    ClientOnRequiredTable opts = new ClientOnRequiredTable();
    opts.parseArgs(Flush.class.getName(), args);
    try {
      AccumuloClient client = opts.getAccumuloClient();
      client.tableOperations().flush(opts.getTableName(), null, null, true);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
