import { PrismaClient } from "@prisma/client";

const prisma = new PrismaClient();

async function main() {
  for (let i = 0; i < 100000; i++) {
    let a = await prisma.oye.findMany();
  }
}

main()
  .then(async () => {
    await prisma.$disconnect();
  })
  .catch(async (e) => {
    console.error(e);
    await prisma.$disconnect();
    process.exit(1);
  });
