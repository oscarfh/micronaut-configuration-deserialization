//package com.example;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonSubTypes;
//import com.fasterxml.jackson.annotation.JsonTypeInfo;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
////@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
////@JsonSubTypes({
////		@JsonSubTypes.Type(value = UnsecureProperties.class, name = "UNSECURE"),
////		@JsonSubTypes.Type(value = ExternalTokenProviderProperties.class, name = "EXTERNAL_TOKEN_PROVIDER"),
////		@JsonSubTypes.Type(value = SilentAppFlowProperties.class, name = "SILENT_APP"),
////		@JsonSubTypes.Type(value = DelegationProperties.class, name = "DELEGATION")}
////)
//public class AuthenticationProperties {
//
//	//private OutgoingAuthenticationMechanism type;
//
//	public AuthenticationProperties() {
//	}
//
//
//}
