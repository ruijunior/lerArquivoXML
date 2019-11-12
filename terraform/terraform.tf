terraform {
  backend "s3" {
    bucket = "rbsionline"
    key = "api-rest-read-xml"
    region = "us-east-1"
    profile = "terraform"
  }
}