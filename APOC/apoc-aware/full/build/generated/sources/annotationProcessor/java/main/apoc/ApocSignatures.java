package apoc;

import java.lang.String;
import java.util.List;

public class ApocSignatures {
  public static final List<String> PROCEDURES = List.of("apoc.log.error",
      		"apoc.log.warn",
      		"apoc.log.info",
      		"apoc.log.debug",
      		"apoc.config.list",
      		"apoc.config.map",
      		"apoc.monitor.ids",
      		"apoc.monitor.kernel",
      		"apoc.monitor.tx",
      		"apoc.monitor.store",
      		"apoc.static.get",
      		"apoc.static.list",
      		"apoc.static.set",
      		"apoc.bolt.load",
      		"apoc.bolt.load.fromLocal",
      		"apoc.bolt.execute",
      		"apoc.mongodb.get",
      		"apoc.mongodb.count",
      		"apoc.mongodb.first",
      		"apoc.mongodb.find",
      		"apoc.mongodb.insert",
      		"apoc.mongodb.delete",
      		"apoc.mongodb.update",
      		"apoc.mongodb.get.byObjectId",
      		"apoc.periodic.rock_n_roll_while",
      		"apoc.periodic.rock_n_roll",
      		"apoc.date.expire",
      		"apoc.date.expireIn",
      		"apoc.custom.asProcedure",
      		"apoc.custom.declareProcedure",
      		"apoc.custom.asFunction",
      		"apoc.custom.declareFunction",
      		"apoc.custom.list",
      		"apoc.custom.removeProcedure",
      		"apoc.custom.removeFunction",
      		"apoc.couchbase.get",
      		"apoc.couchbase.exists",
      		"apoc.couchbase.insert",
      		"apoc.couchbase.upsert",
      		"apoc.couchbase.append",
      		"apoc.couchbase.prepend",
      		"apoc.couchbase.remove",
      		"apoc.couchbase.replace",
      		"apoc.couchbase.query",
      		"apoc.couchbase.posParamsQuery",
      		"apoc.couchbase.namedParamsQuery",
      		"apoc.uuid.install",
      		"apoc.uuid.remove",
      		"apoc.uuid.removeAll",
      		"apoc.uuid.list",
      		"apoc.es.stats",
      		"apoc.es.get",
      		"apoc.es.query",
      		"apoc.es.getRaw",
      		"apoc.es.postRaw",
      		"apoc.es.post",
      		"apoc.es.put",
      		"apoc.metrics.list",
      		"apoc.metrics.storage",
      		"apoc.metrics.get",
      		"apoc.load.html",
      		"apoc.load.driver",
      		"apoc.load.jdbc",
      		"apoc.load.jdbcParams",
      		"apoc.load.jdbcUpdate",
      		"apoc.load.directory.async.add",
      		"apoc.load.directory.async.remove",
      		"apoc.load.directory.async.removeAll",
      		"apoc.load.directory.async.list",
      		"apoc.load.directory",
      		"apoc.load.csv",
      		"apoc.load.csvParams",
      		"apoc.load.xls",
      		"apoc.load.ldap",
      		"apoc.cluster.graph",
      		"apoc.export.xls.all",
      		"apoc.export.xls.data",
      		"apoc.export.xls.graph",
      		"apoc.export.xls.query",
      		"apoc.ttl.expire",
      		"apoc.ttl.expireIn",
      		"apoc.redis.getSet",
      		"apoc.redis.get",
      		"apoc.redis.append",
      		"apoc.redis.incrby",
      		"apoc.redis.hdel",
      		"apoc.redis.hexists",
      		"apoc.redis.hget",
      		"apoc.redis.hincrby",
      		"apoc.redis.hgetall",
      		"apoc.redis.hset",
      		"apoc.redis.push",
      		"apoc.redis.pop",
      		"apoc.redis.lrange",
      		"apoc.redis.sadd",
      		"apoc.redis.scard",
      		"apoc.redis.spop",
      		"apoc.redis.smembers",
      		"apoc.redis.sunion",
      		"apoc.redis.zadd",
      		"apoc.redis.zcard",
      		"apoc.redis.zrangebyscore",
      		"apoc.redis.zrem",
      		"apoc.redis.eval",
      		"apoc.redis.copy",
      		"apoc.redis.exists",
      		"apoc.redis.pexpire",
      		"apoc.redis.persist",
      		"apoc.redis.pttl",
      		"apoc.redis.info",
      		"apoc.redis.configGet",
      		"apoc.redis.configSet",
      		"apoc.systemdb.graph",
      		"apoc.systemdb.execute",
      		"apoc.generate.ba",
      		"apoc.generate.ws",
      		"apoc.generate.er",
      		"apoc.generate.complete",
      		"apoc.generate.simple",
      		"apoc.gephi.add",
      		"apoc.cypher.runFile",
      		"apoc.cypher.runFiles",
      		"apoc.cypher.runSchemaFile",
      		"apoc.cypher.runSchemaFiles",
      		"apoc.cypher.parallel",
      		"apoc.cypher.mapParallel",
      		"apoc.cypher.mapParallel2",
      		"apoc.cypher.parallel2",
      		"apoc.model.jdbc",
      		"apoc.get.nodes",
      		"apoc.get.rels");
  ;

  public static final List<String> FUNCTIONS = List.of("apoc.static.get",
      		"apoc.static.getAll",
      		"apoc.trigger.nodesByLabel",
      		"apoc.trigger.propertiesByKey",
      		"apoc.data.email",
      		"apoc.ttl.config");
  ;
}