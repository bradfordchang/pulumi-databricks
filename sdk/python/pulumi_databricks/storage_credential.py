# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['StorageCredentialArgs', 'StorageCredential']

@pulumi.input_type
class StorageCredentialArgs:
    def __init__(__self__, *,
                 aws_iam_role: Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']] = None,
                 azure_managed_identity: Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']] = None,
                 azure_service_principal: Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a StorageCredential resource.
        :param pulumi.Input[str] name: Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname/sp application_id of the storage credential owner.
        """
        if aws_iam_role is not None:
            pulumi.set(__self__, "aws_iam_role", aws_iam_role)
        if azure_managed_identity is not None:
            pulumi.set(__self__, "azure_managed_identity", azure_managed_identity)
        if azure_service_principal is not None:
            pulumi.set(__self__, "azure_service_principal", azure_service_principal)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']]:
        return pulumi.get(self, "aws_iam_role")

    @aws_iam_role.setter
    def aws_iam_role(self, value: Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']]):
        pulumi.set(self, "aws_iam_role", value)

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']]:
        return pulumi.get(self, "azure_managed_identity")

    @azure_managed_identity.setter
    def azure_managed_identity(self, value: Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']]):
        pulumi.set(self, "azure_managed_identity", value)

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']]:
        return pulumi.get(self, "azure_service_principal")

    @azure_service_principal.setter
    def azure_service_principal(self, value: Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']]):
        pulumi.set(self, "azure_service_principal", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname/sp application_id of the storage credential owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)


@pulumi.input_type
class _StorageCredentialState:
    def __init__(__self__, *,
                 aws_iam_role: Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']] = None,
                 azure_managed_identity: Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']] = None,
                 azure_service_principal: Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StorageCredential resources.
        :param pulumi.Input[str] name: Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname/sp application_id of the storage credential owner.
        """
        if aws_iam_role is not None:
            pulumi.set(__self__, "aws_iam_role", aws_iam_role)
        if azure_managed_identity is not None:
            pulumi.set(__self__, "azure_managed_identity", azure_managed_identity)
        if azure_service_principal is not None:
            pulumi.set(__self__, "azure_service_principal", azure_service_principal)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if metastore_id is not None:
            pulumi.set(__self__, "metastore_id", metastore_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']]:
        return pulumi.get(self, "aws_iam_role")

    @aws_iam_role.setter
    def aws_iam_role(self, value: Optional[pulumi.Input['StorageCredentialAwsIamRoleArgs']]):
        pulumi.set(self, "aws_iam_role", value)

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']]:
        return pulumi.get(self, "azure_managed_identity")

    @azure_managed_identity.setter
    def azure_managed_identity(self, value: Optional[pulumi.Input['StorageCredentialAzureManagedIdentityArgs']]):
        pulumi.set(self, "azure_managed_identity", value)

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']]:
        return pulumi.get(self, "azure_service_principal")

    @azure_service_principal.setter
    def azure_service_principal(self, value: Optional[pulumi.Input['StorageCredentialAzureServicePrincipalArgs']]):
        pulumi.set(self, "azure_service_principal", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "metastore_id")

    @metastore_id.setter
    def metastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metastore_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Username/groupname/sp application_id of the storage credential owner.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)


class StorageCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_iam_role: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAwsIamRoleArgs']]] = None,
                 azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureManagedIdentityArgs']]] = None,
                 azure_service_principal: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureServicePrincipalArgs']]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:

        - `StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
        - ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.

        ## Import

        This resource can be imported by namebash

        ```sh
         $ pulumi import databricks:index/storageCredential:StorageCredential this <name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname/sp application_id of the storage credential owner.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[StorageCredentialArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.

        To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:

        - `StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
        - ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.

        ## Import

        This resource can be imported by namebash

        ```sh
         $ pulumi import databricks:index/storageCredential:StorageCredential this <name>
        ```

        :param str resource_name: The name of the resource.
        :param StorageCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_iam_role: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAwsIamRoleArgs']]] = None,
                 azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureManagedIdentityArgs']]] = None,
                 azure_service_principal: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureServicePrincipalArgs']]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 metastore_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageCredentialArgs.__new__(StorageCredentialArgs)

            __props__.__dict__["aws_iam_role"] = aws_iam_role
            __props__.__dict__["azure_managed_identity"] = azure_managed_identity
            __props__.__dict__["azure_service_principal"] = azure_service_principal
            __props__.__dict__["comment"] = comment
            __props__.__dict__["metastore_id"] = metastore_id
            __props__.__dict__["name"] = name
            __props__.__dict__["owner"] = owner
        super(StorageCredential, __self__).__init__(
            'databricks:index/storageCredential:StorageCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_iam_role: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAwsIamRoleArgs']]] = None,
            azure_managed_identity: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureManagedIdentityArgs']]] = None,
            azure_service_principal: Optional[pulumi.Input[pulumi.InputType['StorageCredentialAzureServicePrincipalArgs']]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            metastore_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None) -> 'StorageCredential':
        """
        Get an existing StorageCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        :param pulumi.Input[str] owner: Username/groupname/sp application_id of the storage credential owner.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageCredentialState.__new__(_StorageCredentialState)

        __props__.__dict__["aws_iam_role"] = aws_iam_role
        __props__.__dict__["azure_managed_identity"] = azure_managed_identity
        __props__.__dict__["azure_service_principal"] = azure_service_principal
        __props__.__dict__["comment"] = comment
        __props__.__dict__["metastore_id"] = metastore_id
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        return StorageCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsIamRole")
    def aws_iam_role(self) -> pulumi.Output[Optional['outputs.StorageCredentialAwsIamRole']]:
        return pulumi.get(self, "aws_iam_role")

    @property
    @pulumi.getter(name="azureManagedIdentity")
    def azure_managed_identity(self) -> pulumi.Output[Optional['outputs.StorageCredentialAzureManagedIdentity']]:
        return pulumi.get(self, "azure_managed_identity")

    @property
    @pulumi.getter(name="azureServicePrincipal")
    def azure_service_principal(self) -> pulumi.Output[Optional['outputs.StorageCredentialAzureServicePrincipal']]:
        return pulumi.get(self, "azure_service_principal")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="metastoreId")
    def metastore_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "metastore_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Username/groupname/sp application_id of the storage credential owner.
        """
        return pulumi.get(self, "owner")

