package it.eng.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {
	private String logLevel;
	private ContextBroker contextBroker;
	private Server server;
	private DeviceRegistry deviceRegistry;
	private Mongodb mongodb;
	private Map<String, TypeDetails> types=new HashMap<String, TypeDetails>();
	private BrowseServerOptions browseServerOptions;
	private String service;
	private String subservice;
	private String providerUrl;
	private String deviceRegistrationDuration;
	private String defaultType;
	private List<Context> contexts=new ArrayList<Context>();
	private List<ContextSubscription> contextSubscriptions=new ArrayList<ContextSubscription>();
	
	public Configuration() {}
	
	
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public ContextBroker getContextBroker() {
		return contextBroker;
	}
	public void setContextBroker(ContextBroker contextBroker) {
		this.contextBroker = contextBroker;
	}
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	public DeviceRegistry getDeviceRegistry() {
		return deviceRegistry;
	}
	public void setDeviceRegistry(DeviceRegistry deviceRegistry) {
		this.deviceRegistry = deviceRegistry;
	}
	public Mongodb getMongodb() {
		return mongodb;
	}
	public void setMongodb(Mongodb mongodb) {
		this.mongodb = mongodb;
	}
	
	public BrowseServerOptions getBrowseServerOptions() {
		return browseServerOptions;
	}
	public void setBrowseServerOptions(BrowseServerOptions browseServerOptions) {
		this.browseServerOptions = browseServerOptions;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getSubservice() {
		return subservice;
	}
	public void setSubservice(String subservice) {
		this.subservice = subservice;
	}
	public String getProviderUrl() {
		return providerUrl;
	}
	public void setProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
	}
	public String getDeviceRegistrationDuration() {
		return deviceRegistrationDuration;
	}
	public void setDeviceRegistrationDuration(String deviceRegistrationDuration) {
		this.deviceRegistrationDuration = deviceRegistrationDuration;
	}
	public String getDefaultType() {
		return defaultType;
	}
	public void setDefaultType(String defaultType) {
		this.defaultType = defaultType;
	}
	public List<Context> getContexts() {
		return contexts;
	}
	public void setContexts(List<Context> contexts) {
		this.contexts = contexts;
	}
	public List<ContextSubscription> getContextSubscriptions() {
		return contextSubscriptions;
	}
	public void setContextSubscriptions(List<ContextSubscription> contextSubscriptions) {
		this.contextSubscriptions = contextSubscriptions;
	}


	public Map<String, TypeDetails> getTypes() {
		return types;
	}


	public void setTypes(Map<String, TypeDetails> types) {
		this.types = types;
	}


	
}