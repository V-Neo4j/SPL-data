package apoc;

import java.lang.String;
import java.util.List;

public class ApocSignatures {
  public static final List<String> PROCEDURES = List.of("apoc.refactor.rename.label",
      		"apoc.refactor.rename.type",
      		"apoc.refactor.rename.nodeProperty",
      		"apoc.refactor.rename.typeProperty",
      		"apoc.refactor.extractNode",
      		"apoc.refactor.collapseNode",
      		"apoc.refactor.cloneNodes",
      		"apoc.refactor.cloneNodesWithRelationships",
      		"apoc.refactor.cloneSubgraphFromPaths",
      		"apoc.refactor.cloneSubgraph",
      		"apoc.refactor.mergeNodes",
      		"apoc.refactor.mergeRelationships",
      		"apoc.refactor.setType",
      		"apoc.refactor.to",
      		"apoc.refactor.invert",
      		"apoc.refactor.from",
      		"apoc.refactor.normalizeAsBoolean",
      		"apoc.refactor.categorize",
      		"apoc.refactor.deleteAndReconnect",
      		"apoc.graph.fromData",
      		"apoc.graph.from",
      		"apoc.graph.fromPath",
      		"apoc.graph.fromPaths",
      		"apoc.graph.fromDB",
      		"apoc.graph.fromCypher",
      		"apoc.graph.fromDocument",
      		"apoc.graph.validateDocument",
      		"apoc.log.stream",
      		"apoc.meta.stats",
      		"apoc.meta.data.of",
      		"apoc.meta.data",
      		"apoc.meta.schema",
      		"apoc.meta.nodeTypeProperties",
      		"apoc.meta.relTypeProperties",
      		"apoc.meta.graph",
      		"apoc.meta.graph.of",
      		"apoc.meta.graphSample",
      		"apoc.meta.subGraph",
      		"apoc.schema.properties.distinct",
      		"apoc.schema.properties.distinctCount",
      		"apoc.merge.node.eager",
      		"apoc.merge.node",
      		"apoc.merge.relationship",
      		"apoc.merge.relationship.eager",
      		"apoc.math.regr",
      		"apoc.stats.degrees",
      		"apoc.example.movies",
      		"apoc.schema.assert",
      		"apoc.schema.nodes",
      		"apoc.schema.relationships",
      		"apoc.coll.zipToRows",
      		"apoc.coll.elements",
      		"apoc.coll.partition",
      		"apoc.coll.split",
      		"apoc.coll.pairWithOffset",
      		"apoc.util.sleep",
      		"apoc.util.validate",
      		"apoc.periodic.truncate",
      		"apoc.periodic.list",
      		"apoc.periodic.commit",
      		"apoc.periodic.cancel",
      		"apoc.periodic.submit",
      		"apoc.periodic.repeat",
      		"apoc.periodic.countdown",
      		"apoc.periodic.iterate",
      		"apoc.neighbors.tohop",
      		"apoc.neighbors.tohop.count",
      		"apoc.neighbors.byhop",
      		"apoc.neighbors.byhop.count",
      		"apoc.neighbors.athop",
      		"apoc.neighbors.athop.count",
      		"apoc.trigger.add",
      		"apoc.trigger.remove",
      		"apoc.trigger.removeAll",
      		"apoc.trigger.list",
      		"apoc.trigger.pause",
      		"apoc.trigger.resume",
      		"apoc.nodes.link",
      		"apoc.nodes.get",
      		"apoc.nodes.delete",
      		"apoc.nodes.rels",
      		"apoc.nodes.collapse",
      		"apoc.nodes.group",
      		"apoc.atomic.add",
      		"apoc.atomic.subtract",
      		"apoc.atomic.concat",
      		"apoc.atomic.insert",
      		"apoc.atomic.remove",
      		"apoc.atomic.update",
      		"apoc.lock.all",
      		"apoc.lock.nodes",
      		"apoc.lock.read.nodes",
      		"apoc.lock.rels",
      		"apoc.lock.read.rels",
      		"apoc.help",
      		"apoc.load.xml",
      		"apoc.load.xmlSimple",
      		"apoc.xml.import",
      		"apoc.import.xml",
      		"apoc.load.jsonArray",
      		"apoc.load.json",
      		"apoc.load.jsonParams",
      		"apoc.export.cypherAll",
      		"apoc.export.cypherData",
      		"apoc.export.cypherGraph",
      		"apoc.export.cypherQuery",
      		"apoc.import.csv",
      		"apoc.export.csv.all",
      		"apoc.export.csv.data",
      		"apoc.export.csv.graph",
      		"apoc.export.csv.query",
      		"apoc.aware.import.csv",
      		"apoc.import.graphml",
      		"apoc.export.graphml.all",
      		"apoc.export.graphml.data",
      		"apoc.export.graphml.graph",
      		"apoc.export.graphml.query",
      		"apoc.export.cypher.all",
      		"apoc.export.cypher.data",
      		"apoc.export.cypher.graph",
      		"apoc.export.cypher.query",
      		"apoc.export.cypher.schema",
      		"apoc.import.json",
      		"apoc.export.json.all",
      		"apoc.export.json.data",
      		"apoc.export.json.graph",
      		"apoc.export.json.query",
      		"apoc.algo.aStar",
      		"apoc.algo.aStarConfig",
      		"apoc.algo.dijkstra",
      		"apoc.algo.allSimplePaths",
      		"apoc.algo.dijkstraWithDefaultWeight",
      		"apoc.algo.cover",
      		"apoc.warmup.run",
      		"apoc.spatial.geocodeOnce",
      		"apoc.spatial.geocode",
      		"apoc.spatial.reverseGeocode",
      		"apoc.spatial.sortByDistance",
      		"run.shortest",
      		"aware.run.shortest",
      		"aware.ICBC.filterComp",
      		"aware.BA.filterComp",
      		"apoc.aware.path.extend",
      		"apoc.aware.path.expand",
      		"apoc.aware.path.expandConfig",
      		"apoc.aware.path.subgraphNodes",
      		"apoc.aware.path.subgraphAll",
      		"apoc.aware.path.spanningTree",
      		"apoc.path.expand",
      		"apoc.path.expandConfig",
      		"apoc.path.extend",
      		"ICBC.filterComp",
      		"BA.filterComp",
      		"apoc.path.subgraphNodes",
      		"apoc.path.subgraphAll",
      		"apoc.path.spanningTree",
      		"apoc.text.phonetic",
      		"apoc.text.phoneticDelta",
      		"apoc.text.doubleMetaphone",
      		"apoc.convert.setJsonProperty",
      		"apoc.convert.toTree",
      		"apoc.cypher.run",
      		"apoc.cypher.runMany",
      		"apoc.cypher.doIt",
      		"apoc.cypher.runWrite",
      		"apoc.cypher.runSchema",
      		"apoc.when",
      		"apoc.do.when",
      		"apoc.case",
      		"apoc.do.case",
      		"apoc.cypher.runTimeboxed",
      		"apoc.search.nodeAllReduced",
      		"apoc.search.nodeReduced",
      		"apoc.search.multiSearchReduced",
      		"apoc.search.nodeAll",
      		"apoc.search.node",
      		"apoc.create.node",
      		"apoc.create.addLabels",
      		"apoc.create.setProperty",
      		"apoc.create.setRelProperty",
      		"apoc.create.setProperties",
      		"apoc.create.removeProperties",
      		"apoc.create.setRelProperties",
      		"apoc.create.removeRelProperties",
      		"apoc.create.setLabels",
      		"apoc.create.removeLabels",
      		"apoc.create.nodes",
      		"apoc.create.relationship",
      		"apoc.create.vNode",
      		"apoc.create.vNodes",
      		"apoc.create.vRelationship",
      		"apoc.create.vPattern",
      		"apoc.create.vPatternFull",
      		"apoc.create.virtualPath",
      		"apoc.create.clonePathToVirtual",
      		"apoc.create.clonePathsToVirtual",
      		"apoc.create.uuids");
  ;

  public static final List<String> FUNCTIONS = List.of("apoc.meta.type",
      		"apoc.meta.typeName",
      		"apoc.meta.types",
      		"apoc.meta.isType",
      		"apoc.meta.cypher.isType",
      		"apoc.meta.cypher.type",
      		"apoc.meta.cypher.types",
      		"apoc.scoring.existence",
      		"apoc.scoring.pareto",
      		"apoc.math.round",
      		"apoc.math.maxLong",
      		"apoc.math.minLong",
      		"apoc.math.maxDouble",
      		"apoc.math.minDouble",
      		"apoc.math.maxInt",
      		"apoc.math.minInt",
      		"apoc.math.maxByte",
      		"apoc.math.minByte",
      		"apoc.schema.node.indexExists",
      		"apoc.schema.node.constraintExists",
      		"apoc.schema.relationship.constraintExists",
      		"apoc.coll.stdev",
      		"apoc.coll.runningTotal",
      		"apoc.coll.zip",
      		"apoc.coll.pairs",
      		"apoc.coll.pairsMin",
      		"apoc.coll.sum",
      		"apoc.coll.avg",
      		"apoc.coll.min",
      		"apoc.coll.max",
      		"apoc.coll.partition",
      		"apoc.coll.contains",
      		"apoc.coll.set",
      		"apoc.coll.insert",
      		"apoc.coll.insertAll",
      		"apoc.coll.remove",
      		"apoc.coll.indexOf",
      		"apoc.coll.containsAll",
      		"apoc.coll.containsSorted",
      		"apoc.coll.containsAllSorted",
      		"apoc.coll.isEqualCollection",
      		"apoc.coll.toSet",
      		"apoc.coll.sumLongs",
      		"apoc.coll.sort",
      		"apoc.coll.sortNodes",
      		"apoc.coll.sortMaps",
      		"apoc.coll.union",
      		"apoc.coll.subtract",
      		"apoc.coll.removeAll",
      		"apoc.coll.intersection",
      		"apoc.coll.disjunction",
      		"apoc.coll.unionAll",
      		"apoc.coll.shuffle",
      		"apoc.coll.randomItem",
      		"apoc.coll.randomItems",
      		"apoc.coll.containsDuplicates",
      		"apoc.coll.duplicates",
      		"apoc.coll.duplicatesWithCount",
      		"apoc.coll.frequencies",
      		"apoc.coll.frequenciesAsMap",
      		"apoc.coll.occurrences",
      		"apoc.coll.flatten",
      		"apoc.coll.reverse",
      		"apoc.coll.sortMulti",
      		"apoc.coll.combinations",
      		"apoc.coll.different",
      		"apoc.coll.dropDuplicateNeighbors",
      		"apoc.coll.fill",
      		"apoc.coll.sortText",
      		"apoc.coll.pairWithOffset",
      		"apoc.util.sha1",
      		"apoc.util.sha256",
      		"apoc.util.sha384",
      		"apoc.util.sha512",
      		"apoc.util.md5",
      		"apoc.util.validatePredicate",
      		"apoc.util.decompress",
      		"apoc.util.compress",
      		"apoc.map.groupBy",
      		"apoc.map.groupByMulti",
      		"apoc.map.fromNodes",
      		"apoc.map.fromPairs",
      		"apoc.map.fromLists",
      		"apoc.map.values",
      		"apoc.map.fromValues",
      		"apoc.map.merge",
      		"apoc.map.mergeList",
      		"apoc.map.get",
      		"apoc.map.mget",
      		"apoc.map.submap",
      		"apoc.map.setKey",
      		"apoc.map.setEntry",
      		"apoc.map.setPairs",
      		"apoc.map.setLists",
      		"apoc.map.setValues",
      		"apoc.map.removeKey",
      		"apoc.map.removeKeys",
      		"apoc.map.clean",
      		"apoc.map.updateTree",
      		"apoc.map.flatten",
      		"apoc.map.unflatten",
      		"apoc.map.sortedProperties",
      		"apoc.date.toYears",
      		"apoc.date.fields",
      		"apoc.date.field",
      		"apoc.date.currentTimestamp",
      		"apoc.date.format",
      		"apoc.date.toISO8601",
      		"apoc.date.fromISO8601",
      		"apoc.date.parse",
      		"apoc.date.parseAsZonedDateTime",
      		"apoc.date.systemTimezone",
      		"apoc.date.convert",
      		"apoc.date.convertFormat",
      		"apoc.date.add",
      		"apoc.data.url",
      		"apoc.data.domain",
      		"apoc.node.relationship.exists",
      		"apoc.nodes.connected",
      		"apoc.node.labels",
      		"apoc.node.id",
      		"apoc.rel.id",
      		"apoc.rel.startNode",
      		"apoc.rel.endNode",
      		"apoc.rel.type",
      		"apoc.any.properties",
      		"apoc.any.property",
      		"apoc.node.degree",
      		"apoc.node.degree.in",
      		"apoc.node.degree.out",
      		"apoc.node.relationship.types",
      		"apoc.nodes.relationship.types",
      		"apoc.node.relationships.exist",
      		"apoc.nodes.relationships.exist",
      		"apoc.nodes.isDense",
      		"apoc.number.format",
      		"apoc.number.parseInt",
      		"apoc.number.parseFloat",
      		"apoc.number.exact.add",
      		"apoc.number.exact.sub",
      		"apoc.number.exact.mul",
      		"apoc.number.exact.div",
      		"apoc.number.exact.toInteger",
      		"apoc.number.exact.toFloat",
      		"apoc.number.exact.toExact",
      		"apoc.number.romanToArabic",
      		"apoc.number.arabicToRoman",
      		"apoc.diff.nodes",
      		"apoc.xml.parse",
      		"apoc.bitwise.op",
      		"apoc.hashing.fingerprint",
      		"apoc.hashing.fingerprinting",
      		"apoc.hashing.fingerprintGraph",
      		"apoc.label.exists",
      		"apoc.temporal.format",
      		"apoc.temporal.formatDuration",
      		"apoc.temporal.toZonedTemporal",
      		"apoc.aware.path.combine",
      		"apoc.path.combine",
      		"apoc.path.create",
      		"apoc.path.slice",
      		"apoc.path.elements",
      		"apoc.version",
      		"apoc.text.phonetic",
      		"apoc.text.doubleMetaphone",
      		"apoc.text.indexOf",
      		"apoc.text.indexesOf",
      		"apoc.text.replace",
      		"apoc.text.byteCount",
      		"apoc.text.bytes",
      		"apoc.text.regreplace",
      		"apoc.text.split",
      		"apoc.text.regexGroups",
      		"apoc.text.join",
      		"apoc.text.clean",
      		"apoc.text.compareCleaned",
      		"apoc.text.distance",
      		"apoc.text.levenshteinDistance",
      		"apoc.text.levenshteinSimilarity",
      		"apoc.text.hammingDistance",
      		"apoc.text.jaroWinklerDistance",
      		"apoc.text.sorensenDiceSimilarity",
      		"apoc.text.fuzzyMatch",
      		"apoc.text.urlencode",
      		"apoc.text.urldecode",
      		"apoc.text.lpad",
      		"apoc.text.rpad",
      		"apoc.text.format",
      		"apoc.text.slug",
      		"apoc.text.random",
      		"apoc.text.capitalize",
      		"apoc.text.capitalizeAll",
      		"apoc.text.decapitalize",
      		"apoc.text.decapitalizeAll",
      		"apoc.text.swapCase",
      		"apoc.text.camelCase",
      		"apoc.text.upperCamelCase",
      		"apoc.text.snakeCase",
      		"apoc.text.toUpperCase",
      		"apoc.text.base64Encode",
      		"apoc.text.base64Decode",
      		"apoc.text.base64UrlEncode",
      		"apoc.text.base64UrlDecode",
      		"apoc.text.charAt",
      		"apoc.text.code",
      		"apoc.text.hexValue",
      		"apoc.text.hexCharAt",
      		"apoc.text.toCypher",
      		"apoc.text.repeat",
      		"apoc.json.path",
      		"apoc.convert.toJson",
      		"apoc.convert.getJsonProperty",
      		"apoc.convert.getJsonPropertyMap",
      		"apoc.convert.fromJsonMap",
      		"apoc.convert.fromJsonList",
      		"apoc.convert.toSortedJsonMap",
      		"apoc.convert.toMap",
      		"apoc.convert.toString",
      		"apoc.convert.toList",
      		"apoc.convert.toBoolean",
      		"apoc.convert.toNode",
      		"apoc.convert.toRelationship",
      		"apoc.convert.toSet",
      		"apoc.convert.toIntList",
      		"apoc.convert.toStringList",
      		"apoc.convert.toBooleanList",
      		"apoc.convert.toNodeList",
      		"apoc.convert.toRelationshipList",
      		"apoc.convert.toInteger",
      		"apoc.convert.toFloat",
      		"apoc.cypher.runFirstColumn",
      		"apoc.cypher.runFirstColumnMany",
      		"apoc.cypher.runFirstColumnSingle",
      		"apoc.create.vNode",
      		"apoc.create.virtual.fromNode",
      		"apoc.create.vRelationship",
      		"apoc.create.uuid",
      		"apoc.agg.percentiles",
      		"apoc.agg.product",
      		"apoc.agg.graph",
      		"apoc.agg.median",
      		"apoc.agg.maxItems",
      		"apoc.agg.minItems",
      		"apoc.agg.nth",
      		"apoc.agg.first",
      		"apoc.agg.last",
      		"apoc.agg.slice",
      		"apoc.agg.statistics");
  ;
}
