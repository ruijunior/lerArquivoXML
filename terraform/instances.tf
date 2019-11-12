resource "aws_key_pair" "keypair" {
  public_key = "${file("key/rbsi_key.pub")}"
}

resource "aws_instance" "instances" {
  ami = "ami-00dc79254d0461090"
  instance_type = "t2.micro"

  subnet_id = "${element(aws_subnet.public_subnet.*.id, 0 )}"

  key_name = "${aws_key_pair.keypair.key_name}"

  vpc_security_group_ids = ["${aws_security_group.allow_ssh.id}"]

  tags = {
    Name = "rbsi_instances"
  }
}

output "public_ip" {
  value = "${join(", ", aws_instance.instances.*.public_ip)}"
}