# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AzureAdlsGen2MountArgs', 'AzureAdlsGen2Mount']

@pulumi.input_type
class AzureAdlsGen2MountArgs:
    def __init__(__self__, *,
                 client_id: pulumi.Input[str],
                 client_secret_key: pulumi.Input[str],
                 client_secret_scope: pulumi.Input[str],
                 container_name: pulumi.Input[str],
                 initialize_file_system: pulumi.Input[bool],
                 mount_name: pulumi.Input[str],
                 storage_account_name: pulumi.Input[str],
                 tenant_id: pulumi.Input[str],
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AzureAdlsGen2Mount resource.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret_key", client_secret_key)
        pulumi.set(__self__, "client_secret_scope", client_secret_scope)
        pulumi.set(__self__, "container_name", container_name)
        pulumi.set(__self__, "initialize_file_system", initialize_file_system)
        pulumi.set(__self__, "mount_name", mount_name)
        pulumi.set(__self__, "storage_account_name", storage_account_name)
        pulumi.set(__self__, "tenant_id", tenant_id)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecretKey")
    def client_secret_key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "client_secret_key")

    @client_secret_key.setter
    def client_secret_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_secret_key", value)

    @property
    @pulumi.getter(name="clientSecretScope")
    def client_secret_scope(self) -> pulumi.Input[str]:
        return pulumi.get(self, "client_secret_scope")

    @client_secret_scope.setter
    def client_secret_scope(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_secret_scope", value)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter(name="initializeFileSystem")
    def initialize_file_system(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "initialize_file_system")

    @initialize_file_system.setter
    def initialize_file_system(self, value: pulumi.Input[bool]):
        pulumi.set(self, "initialize_file_system", value)

    @property
    @pulumi.getter(name="mountName")
    def mount_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "mount_name")

    @mount_name.setter
    def mount_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "mount_name", value)

    @property
    @pulumi.getter(name="storageAccountName")
    def storage_account_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "storage_account_name")

    @storage_account_name.setter
    def storage_account_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_account_name", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory", value)


@pulumi.input_type
class _AzureAdlsGen2MountState:
    def __init__(__self__, *,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret_key: Optional[pulumi.Input[str]] = None,
                 client_secret_scope: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 initialize_file_system: Optional[pulumi.Input[bool]] = None,
                 mount_name: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 storage_account_name: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AzureAdlsGen2Mount resources.
        """
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret_key is not None:
            pulumi.set(__self__, "client_secret_key", client_secret_key)
        if client_secret_scope is not None:
            pulumi.set(__self__, "client_secret_scope", client_secret_scope)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if container_name is not None:
            pulumi.set(__self__, "container_name", container_name)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)
        if initialize_file_system is not None:
            pulumi.set(__self__, "initialize_file_system", initialize_file_system)
        if mount_name is not None:
            pulumi.set(__self__, "mount_name", mount_name)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if storage_account_name is not None:
            pulumi.set(__self__, "storage_account_name", storage_account_name)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecretKey")
    def client_secret_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "client_secret_key")

    @client_secret_key.setter
    def client_secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret_key", value)

    @property
    @pulumi.getter(name="clientSecretScope")
    def client_secret_scope(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "client_secret_scope")

    @client_secret_scope.setter
    def client_secret_scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret_scope", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory", value)

    @property
    @pulumi.getter(name="initializeFileSystem")
    def initialize_file_system(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "initialize_file_system")

    @initialize_file_system.setter
    def initialize_file_system(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "initialize_file_system", value)

    @property
    @pulumi.getter(name="mountName")
    def mount_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mount_name")

    @mount_name.setter
    def mount_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mount_name", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="storageAccountName")
    def storage_account_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "storage_account_name")

    @storage_account_name.setter
    def storage_account_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_account_name", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_id", value)


class AzureAdlsGen2Mount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret_key: Optional[pulumi.Input[str]] = None,
                 client_secret_scope: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 initialize_file_system: Optional[pulumi.Input[bool]] = None,
                 mount_name: Optional[pulumi.Input[str]] = None,
                 storage_account_name: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a AzureAdlsGen2Mount resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AzureAdlsGen2MountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AzureAdlsGen2Mount resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AzureAdlsGen2MountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AzureAdlsGen2MountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret_key: Optional[pulumi.Input[str]] = None,
                 client_secret_scope: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 initialize_file_system: Optional[pulumi.Input[bool]] = None,
                 mount_name: Optional[pulumi.Input[str]] = None,
                 storage_account_name: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AzureAdlsGen2MountArgs.__new__(AzureAdlsGen2MountArgs)

            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            if client_secret_key is None and not opts.urn:
                raise TypeError("Missing required property 'client_secret_key'")
            __props__.__dict__["client_secret_key"] = client_secret_key
            if client_secret_scope is None and not opts.urn:
                raise TypeError("Missing required property 'client_secret_scope'")
            __props__.__dict__["client_secret_scope"] = client_secret_scope
            __props__.__dict__["cluster_id"] = cluster_id
            if container_name is None and not opts.urn:
                raise TypeError("Missing required property 'container_name'")
            __props__.__dict__["container_name"] = container_name
            __props__.__dict__["directory"] = directory
            if initialize_file_system is None and not opts.urn:
                raise TypeError("Missing required property 'initialize_file_system'")
            __props__.__dict__["initialize_file_system"] = initialize_file_system
            if mount_name is None and not opts.urn:
                raise TypeError("Missing required property 'mount_name'")
            __props__.__dict__["mount_name"] = mount_name
            if storage_account_name is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account_name'")
            __props__.__dict__["storage_account_name"] = storage_account_name
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = tenant_id
            __props__.__dict__["source"] = None
        super(AzureAdlsGen2Mount, __self__).__init__(
            'databricks:index/azureAdlsGen2Mount:AzureAdlsGen2Mount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_secret_key: Optional[pulumi.Input[str]] = None,
            client_secret_scope: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            container_name: Optional[pulumi.Input[str]] = None,
            directory: Optional[pulumi.Input[str]] = None,
            initialize_file_system: Optional[pulumi.Input[bool]] = None,
            mount_name: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            storage_account_name: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None) -> 'AzureAdlsGen2Mount':
        """
        Get an existing AzureAdlsGen2Mount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AzureAdlsGen2MountState.__new__(_AzureAdlsGen2MountState)

        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_secret_key"] = client_secret_key
        __props__.__dict__["client_secret_scope"] = client_secret_scope
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["container_name"] = container_name
        __props__.__dict__["directory"] = directory
        __props__.__dict__["initialize_file_system"] = initialize_file_system
        __props__.__dict__["mount_name"] = mount_name
        __props__.__dict__["source"] = source
        __props__.__dict__["storage_account_name"] = storage_account_name
        __props__.__dict__["tenant_id"] = tenant_id
        return AzureAdlsGen2Mount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecretKey")
    def client_secret_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "client_secret_key")

    @property
    @pulumi.getter(name="clientSecretScope")
    def client_secret_scope(self) -> pulumi.Output[str]:
        return pulumi.get(self, "client_secret_scope")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter
    def directory(self) -> pulumi.Output[str]:
        return pulumi.get(self, "directory")

    @property
    @pulumi.getter(name="initializeFileSystem")
    def initialize_file_system(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "initialize_file_system")

    @property
    @pulumi.getter(name="mountName")
    def mount_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "mount_name")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[str]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="storageAccountName")
    def storage_account_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "storage_account_name")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tenant_id")
