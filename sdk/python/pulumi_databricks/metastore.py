# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MetastoreArgs', 'Metastore']

@pulumi.input_type
class MetastoreArgs:
    def __init__(__self__, *,
                 storage_root: pulumi.Input[str],
                 default_data_access_config_id: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Metastore resource.
        :param pulumi.Input[str] storage_root: Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        :param pulumi.Input[bool] force_destroy: Destroy metastore regardless of its contents.
        :param pulumi.Input[str] name: Name of metastore.
        :param pulumi.Input[str] owner: Username/groupname of Metastore owner.
        """
        pulumi.set(__self__, "storage_root", storage_root)
        if default_data_access_config_id is not None:
            pulumi.set(__self__, "default_data_access_config_id", default_data_access_config_id)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="storageRoot")
    def storage_root(self) -> pulumi.Input[str]:
        """
        Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_root")

    @storage_root.setter
    def storage_root(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_root", value)

    @property
    @pulumi.getter(name="defaultDataAccessConfigId")
    def default_data_access_config_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "default_data_access_config_id")

    @default_data_access_config_id.setter
    def default_data_access_config_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_data_access_config_id", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Destroy metastore regardless of its contents.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of metastore.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname of Metastore owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)


@pulumi.input_type
class _MetastoreState:
    def __init__(__self__, *,
                 default_data_access_config_id: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 storage_root: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Metastore resources.
        :param pulumi.Input[bool] force_destroy: Destroy metastore regardless of its contents.
        :param pulumi.Input[str] name: Name of metastore.
        :param pulumi.Input[str] owner: Username/groupname of Metastore owner.
        :param pulumi.Input[str] storage_root: Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        if default_data_access_config_id is not None:
            pulumi.set(__self__, "default_data_access_config_id", default_data_access_config_id)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if storage_root is not None:
            pulumi.set(__self__, "storage_root", storage_root)

    @property
    @pulumi.getter(name="defaultDataAccessConfigId")
    def default_data_access_config_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "default_data_access_config_id")

    @default_data_access_config_id.setter
    def default_data_access_config_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_data_access_config_id", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Destroy metastore regardless of its contents.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of metastore.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname of Metastore owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="storageRoot")
    def storage_root(self) -> Optional[pulumi.Input[str]]:
        """
        Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_root")

    @storage_root.setter
    def storage_root(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_root", value)


class Metastore(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_data_access_config_id: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 storage_root: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables and views) and the permissions that govern access to them. Databricks account admins can create metastores and assign them to Databricks workspaces in order to control which workloads use each metastore.

        Unity Catalog offers a new metastore with built in security and auditing. This is distinct to the metastore used in previous versions of Databricks (based on the Hive Metastore).

        ## Import

        This resource can be imported by IDbash

        ```sh
         $ pulumi import databricks:index/metastore:Metastore this <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force_destroy: Destroy metastore regardless of its contents.
        :param pulumi.Input[str] name: Name of metastore.
        :param pulumi.Input[str] owner: Username/groupname of Metastore owner.
        :param pulumi.Input[str] storage_root: Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetastoreArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables and views) and the permissions that govern access to them. Databricks account admins can create metastores and assign them to Databricks workspaces in order to control which workloads use each metastore.

        Unity Catalog offers a new metastore with built in security and auditing. This is distinct to the metastore used in previous versions of Databricks (based on the Hive Metastore).

        ## Import

        This resource can be imported by IDbash

        ```sh
         $ pulumi import databricks:index/metastore:Metastore this <id>
        ```

        :param str resource_name: The name of the resource.
        :param MetastoreArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetastoreArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_data_access_config_id: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 storage_root: Optional[pulumi.Input[str]] = None,
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
            __props__ = MetastoreArgs.__new__(MetastoreArgs)

            __props__.__dict__["default_data_access_config_id"] = default_data_access_config_id
            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["name"] = name
            __props__.__dict__["owner"] = owner
            if storage_root is None and not opts.urn:
                raise TypeError("Missing required property 'storage_root'")
            __props__.__dict__["storage_root"] = storage_root
        super(Metastore, __self__).__init__(
            'databricks:index/metastore:Metastore',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_data_access_config_id: Optional[pulumi.Input[str]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            storage_root: Optional[pulumi.Input[str]] = None) -> 'Metastore':
        """
        Get an existing Metastore resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force_destroy: Destroy metastore regardless of its contents.
        :param pulumi.Input[str] name: Name of metastore.
        :param pulumi.Input[str] owner: Username/groupname of Metastore owner.
        :param pulumi.Input[str] storage_root: Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetastoreState.__new__(_MetastoreState)

        __props__.__dict__["default_data_access_config_id"] = default_data_access_config_id
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["storage_root"] = storage_root
        return Metastore(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultDataAccessConfigId")
    def default_data_access_config_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "default_data_access_config_id")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Destroy metastore regardless of its contents.
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of metastore.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Username/groupname of Metastore owner.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="storageRoot")
    def storage_root(self) -> pulumi.Output[str]:
        """
        Path on cloud storage account, where managed Table are stored. Change forces creation of a new resource.
        """
        return pulumi.get(self, "storage_root")

