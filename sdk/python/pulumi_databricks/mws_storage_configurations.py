# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MwsStorageConfigurationsArgs', 'MwsStorageConfigurations']

@pulumi.input_type
class MwsStorageConfigurationsArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 bucket_name: pulumi.Input[str],
                 storage_configuration_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a MwsStorageConfigurations resource.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] bucket_name: name of AWS S3 bucket
        :param pulumi.Input[str] storage_configuration_name: name under which this storage configuration is stored
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "bucket_name", bucket_name)
        pulumi.set(__self__, "storage_configuration_name", storage_configuration_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Input[str]:
        """
        name of AWS S3 bucket
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="storageConfigurationName")
    def storage_configuration_name(self) -> pulumi.Input[str]:
        """
        name under which this storage configuration is stored
        """
        return pulumi.get(self, "storage_configuration_name")

    @storage_configuration_name.setter
    def storage_configuration_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_configuration_name", value)


@pulumi.input_type
class _MwsStorageConfigurationsState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[int]] = None,
                 storage_configuration_id: Optional[pulumi.Input[str]] = None,
                 storage_configuration_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MwsStorageConfigurations resources.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] bucket_name: name of AWS S3 bucket
        :param pulumi.Input[str] storage_configuration_id: (String) id of storage config to be used for `databricks_mws_workspace` resource.
        :param pulumi.Input[str] storage_configuration_name: name under which this storage configuration is stored
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if storage_configuration_id is not None:
            pulumi.set(__self__, "storage_configuration_id", storage_configuration_id)
        if storage_configuration_name is not None:
            pulumi.set(__self__, "storage_configuration_name", storage_configuration_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        name of AWS S3 bucket
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter(name="storageConfigurationId")
    def storage_configuration_id(self) -> Optional[pulumi.Input[str]]:
        """
        (String) id of storage config to be used for `databricks_mws_workspace` resource.
        """
        return pulumi.get(self, "storage_configuration_id")

    @storage_configuration_id.setter
    def storage_configuration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_configuration_id", value)

    @property
    @pulumi.getter(name="storageConfigurationName")
    def storage_configuration_name(self) -> Optional[pulumi.Input[str]]:
        """
        name under which this storage configuration is stored
        """
        return pulumi.get(self, "storage_configuration_name")

    @storage_configuration_name.setter
    def storage_configuration_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_configuration_name", value)


class MwsStorageConfigurations(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 storage_configuration_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        config = pulumi.Config()
        databricks_account_id = config.require_object("databricksAccountId")
        root_storage_bucket = aws.s3.BucketV2("rootStorageBucket", acl="private")
        root_versioning = aws.s3.BucketVersioningV2("rootVersioning",
            bucket=root_storage_bucket.id,
            versioning_configuration=aws.s3.BucketVersioningV2VersioningConfigurationArgs(
                status="Disabled",
            ))
        this = databricks.MwsStorageConfigurations("this",
            account_id=databricks_account_id,
            storage_configuration_name=f"{var['prefix']}-storage",
            bucket_name=root_storage_bucket.bucket,
            opts=pulumi.ResourceOptions(provider=databricks["mws"]))
        ```
        ## Related Resources

        The following resources are used in the same context:

        * Provisioning Databricks on AWS guide.
        * Provisioning Databricks on AWS with PrivateLink guide.
        * MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
        * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
        * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
        * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
        * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] bucket_name: name of AWS S3 bucket
        :param pulumi.Input[str] storage_configuration_name: name under which this storage configuration is stored
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MwsStorageConfigurationsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        config = pulumi.Config()
        databricks_account_id = config.require_object("databricksAccountId")
        root_storage_bucket = aws.s3.BucketV2("rootStorageBucket", acl="private")
        root_versioning = aws.s3.BucketVersioningV2("rootVersioning",
            bucket=root_storage_bucket.id,
            versioning_configuration=aws.s3.BucketVersioningV2VersioningConfigurationArgs(
                status="Disabled",
            ))
        this = databricks.MwsStorageConfigurations("this",
            account_id=databricks_account_id,
            storage_configuration_name=f"{var['prefix']}-storage",
            bucket_name=root_storage_bucket.bucket,
            opts=pulumi.ResourceOptions(provider=databricks["mws"]))
        ```
        ## Related Resources

        The following resources are used in the same context:

        * Provisioning Databricks on AWS guide.
        * Provisioning Databricks on AWS with PrivateLink guide.
        * MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
        * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
        * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
        * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
        * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param MwsStorageConfigurationsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MwsStorageConfigurationsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 storage_configuration_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MwsStorageConfigurationsArgs.__new__(MwsStorageConfigurationsArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = None if account_id is None else pulumi.Output.secret(account_id)
            if bucket_name is None and not opts.urn:
                raise TypeError("Missing required property 'bucket_name'")
            __props__.__dict__["bucket_name"] = bucket_name
            if storage_configuration_name is None and not opts.urn:
                raise TypeError("Missing required property 'storage_configuration_name'")
            __props__.__dict__["storage_configuration_name"] = storage_configuration_name
            __props__.__dict__["creation_time"] = None
            __props__.__dict__["storage_configuration_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accountId"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(MwsStorageConfigurations, __self__).__init__(
            'databricks:index/mwsStorageConfigurations:MwsStorageConfigurations',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            bucket_name: Optional[pulumi.Input[str]] = None,
            creation_time: Optional[pulumi.Input[int]] = None,
            storage_configuration_id: Optional[pulumi.Input[str]] = None,
            storage_configuration_name: Optional[pulumi.Input[str]] = None) -> 'MwsStorageConfigurations':
        """
        Get an existing MwsStorageConfigurations resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        :param pulumi.Input[str] bucket_name: name of AWS S3 bucket
        :param pulumi.Input[str] storage_configuration_id: (String) id of storage config to be used for `databricks_mws_workspace` resource.
        :param pulumi.Input[str] storage_configuration_name: name under which this storage configuration is stored
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MwsStorageConfigurationsState.__new__(_MwsStorageConfigurationsState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["bucket_name"] = bucket_name
        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["storage_configuration_id"] = storage_configuration_id
        __props__.__dict__["storage_configuration_name"] = storage_configuration_name
        return MwsStorageConfigurations(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Output[str]:
        """
        name of AWS S3 bucket
        """
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[int]:
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="storageConfigurationId")
    def storage_configuration_id(self) -> pulumi.Output[str]:
        """
        (String) id of storage config to be used for `databricks_mws_workspace` resource.
        """
        return pulumi.get(self, "storage_configuration_id")

    @property
    @pulumi.getter(name="storageConfigurationName")
    def storage_configuration_name(self) -> pulumi.Output[str]:
        """
        name under which this storage configuration is stored
        """
        return pulumi.get(self, "storage_configuration_name")

