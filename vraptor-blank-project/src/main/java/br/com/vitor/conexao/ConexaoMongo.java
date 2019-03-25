package br.com.vitor.conexao;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.BsonValueCodecProvider;
import org.bson.codecs.DocumentCodecProvider;
import org.bson.codecs.ValueCodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ConexaoMongo {
	static MongoDatabase db;
	static MongoClient mongoClient;
	static {

		CodecRegistry pojoCodecRegistry = fromRegistries(
				fromProviders(new ValueCodecProvider(), new BsonValueCodecProvider(), new DocumentCodecProvider(),
						PojoCodecProvider.builder().automatic(true).build()));
		MongoClientSettings settings = MongoClientSettings.builder().codecRegistry(pojoCodecRegistry).build();
		mongoClient = MongoClients.create(settings);
		db = mongoClient.getDatabase("Loteria");
	}

	public static MongoDatabase getDataBase() {
		return db;
	}

}
